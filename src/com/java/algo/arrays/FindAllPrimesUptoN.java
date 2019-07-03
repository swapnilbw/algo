package com.java.algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllPrimesUptoN {
    public static void main(String[] args) {
        List<Integer> R = getAllPrimes(100);
        System.out.println(R.toString());
    }

    private static List<Integer> getAllPrimes(int N) {
        boolean[] A = new boolean[N];
        List<Integer> R = new ArrayList<>();
        Arrays.fill(A, Boolean.TRUE);
        A[0] = false;
        A[1] = false;
        for (int i = 2; i < A.length; i++) {
            if (A[i] == Boolean.TRUE) { // its prime
                R.add(i);
                // set multiple of current prime to false
                for (int j = i; j < A.length; ) {
                    j = j + i;
                    if(j<N)
                    A[j] = false;
                }
            }
        }
        return R;
    }
}
