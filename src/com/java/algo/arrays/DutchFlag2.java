package com.java.algo.arrays;

import java.util.Arrays;

public class DutchFlag2 {

    public static void main(String[] args) {
        dutchFlag(new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3});
    }

    private static void dutchFlag(int[] A) {
        System.out.println(Arrays.toString(A));
        // first loop to shift less than medium to left
        int M = 2;
        for (int i = 0, C = 0; i < A.length; i++) {
            if (A[i] < M) { // swap
                int tmp = A[i];
                A[i] = A[C];
                A[C++] = tmp;
            }
        }
        System.out.println(Arrays.toString(A));
        // second loop to shift greater than medium to right
        for (int i = A.length - 1, C = A.length - 1; i >= 0; i--) {
            if (A[i] > M) { // swap
                int tmp = A[i];
                A[i] = A[C];
                A[C--] = tmp;
            }
        }
        System.out.println(Arrays.toString(A));

    }

}
