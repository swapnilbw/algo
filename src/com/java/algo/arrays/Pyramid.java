package com.java.algo.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pyramid {

    public static void main(String[] args) {
        createPyramid(6);
    }

    private static void createPyramid(int N) {
        List<List<Integer>> LL = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            List<Integer> L = new ArrayList<>(i + 1);
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {// first and last index
                    L.add(j, 1);
                } else {
                    int val = LL.get(i - 1).get(j) + LL.get(i - 1).get(j - 1);
                    L.add(j, val);
                }
            }
            LL.add(i,L);
        }
        System.out.println(LL.toString());
    }
}
