package com.java.algo.arrays.subarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KSum {
    public static void main(String[] args) {
        boolean B = isKSumSubArray(new int[]{1, 2, -6, 3, 1, -2}, 3);
        System.out.println(B);
        int[] R = longestKSumArray(new int[]{1, 2, -6, 3, 1, -2}, 3);
        System.out.println(Arrays.toString(R));
    }

    private static boolean isKSumSubArray(int[] A, int k) {
        int sum = 0;
        int currSum = 0;
        Map<Integer, Integer> M = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            currSum += A[i];
            // currSum-x =k
            if (currSum == k || M.containsKey(currSum - k)) { // k sum exists
                return true;
            }
            M.put(currSum, i);
        }
        return false;
    }

    private static int[] longestKSumArray(int[] A, int k) {
        int sum = 0;
        int currSum = 0;
        Map<Integer, Integer> M = new HashMap<>();
        int start = 0, end = 0, maxStart = 0, maxEnd = 0;
        for (int i = 0; i < A.length; i++) {
            currSum += A[i];
            if (currSum == k) // sub array starts from 0 to current index
            {
                start = 0;
                end = i;
            } else if (M.containsKey(currSum - k)) { // k sum exists , from historical sum index + 1 to current index
                start = M.get(currSum - k) + 1;
                end = i;
            }
            M.put(currSum, i);
            // find the max array
            if (end - start > maxEnd - maxStart) {
                maxStart = start;
                maxEnd = end;
            }
        }
        return Arrays.copyOfRange(A, maxStart, maxEnd + 1);

    }
}
