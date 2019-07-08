package com.java.algo.arrays.subarray;

import java.util.Arrays;

public class MaxSum{
    public static void main(String[] args) {
        int result =  maxSumSubArray(new int[]{1,-3,2,1,0,-2});
        System.out.println(result);
        int [] R =findMaxSumSubArray(new int[]{1,-3,2,1,0,-2});
        System.out.println(Arrays.toString(R));
        R =findMaxSumSubArray(new int[]{-2,3,2,-1});
        System.out.println(Arrays.toString(R));
    }

    private static int maxSumSubArray(int[] A) {
        int localMax = A[0];
        int globalMax = A[0];

        for(int i=1; i < A.length;i++){
            // using Kadanes algorithm
            localMax = Math.max(A[i],localMax+A[i]);
            globalMax = Math.max(globalMax,localMax);
        }
        return globalMax;
    }

    private static int [] findMaxSumSubArray(int[] A){
        int localMax = A[0];
        int globalMax = A[0];
        int startIndex = 0;
        int endIndex = 0;
        for(int i =0 ; i < A.length ; i++){
            localMax = Math.max(A[i],A[i]+localMax);
            if(localMax<0){
               // localMax = 0;
                startIndex = i +1;
            }
            if(localMax>globalMax){
                globalMax = localMax;
                endIndex = i;
            }
        }
        return Arrays.copyOfRange(A,startIndex,endIndex+1);
    }
}
