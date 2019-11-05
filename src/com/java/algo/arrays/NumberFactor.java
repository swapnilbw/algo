package com.java.algo.arrays;

/**
 * How many ways to get given number example 4 from underlying subset {1,3,4}
 */
public class NumberFactor {


    public static void main(String[] args) {
        int totalWays = numberFactor(new int[]{1, 3, 4}, 4);
        System.out.println(totalWays);
    }

    private static int numberFactor(int[] A, int N) {
        int ways = 0;

        if (N == 0) return 1;
        if (N < 0) return 0;

        for (int i = 0; i < A.length; i++) {
            ways += numberFactor(A, N - A[i]);
        }
        return ways;
    }
}
