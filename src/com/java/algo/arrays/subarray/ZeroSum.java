package com.java.algo.arrays.subarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZeroSum {
    public static void main(String[] args) {
        boolean isZeroSum = zeroSum(new int[]{1, -3, 2, 1, 0, -2});
        System.out.println(isZeroSum);
        int[] R = findZeroSumSubArray(new int[]{1, -3, 2, 1, 0, -2});
        System.out.println(Arrays.toString(R));
        R = longestZeroSumSubArray(new int[]{1, -3, 2, 1, 0, -2});
        System.out.println(Arrays.toString(R));
    }

    /**
     * IF currSum ==0 or currSum exists in already then it's zero sum array
     *
     * @param A
     * @return
     */
    private static boolean zeroSum(int[] A) {

        int currSum = 0;
        Map<Integer, Integer> sumMapper = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            currSum += A[i];
            if (currSum == 0 || sumMapper.containsKey(currSum)) {
                return true;
            }

            sumMapper.put(currSum, i);
        }
        return false;
    }

    private static int[] findZeroSumSubArray(int[] A) {
        int currSum = 0, start = 0, end = 0;
        Map<Integer, Integer> sumMapper = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            currSum += A[i];

            if (currSum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (sumMapper.containsKey(currSum)) {
                start = sumMapper.get(currSum) +1;
                end = i;
                break;
            }
            sumMapper.put(currSum, i);
        }
        return Arrays.copyOfRange(A, start, end + 1);
    }

    private static int[] longestZeroSumSubArray(int[] A) {
        int currSum = 0, start = 0, end = 0, maxStart = 0, maxEnd = 0;
        Map<Integer, Integer> M = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            currSum += A[i];

            if(currSum==0) {
                start = 0;
                end = i;
            }
            if(M.containsKey(currSum)){
                start = M.get(currSum) + 1;
                end = i;
            }
            M.put(currSum,i);
            // find max aray
            System.out.println(currSum + " " +start + "  " +end);
            if(end-start > maxEnd-maxStart) {
                maxStart = start;
                maxEnd = end;
            }
        }
        return Arrays.copyOfRange(A,maxStart,maxEnd+1);

    }
}
