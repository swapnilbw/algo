package com.java.algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteDuplicateSortedArray {

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);A.add(1);A.add(2);A.add(3);A.add(3);A.add(3);A.add(4);A.add(4);A.add(5);A.add(5);

        deleteDuplicateSortedArray(A);
    }

    private static void deleteDuplicateSortedArray(List<Integer> A) {

        System.out.println(A.toString());
        int WI = 0;
        for (int i = 1; i < A.size(); i++) {
            if (Integer.compare(A.get(WI),A.get(i))!=0) {
                A.set(WI + 1, A.get(i));
            }
        }
        System.out.println(A.toString());
        for (int i = WI + 1; i < A.size(); i++) {
            A.remove(i);
        }
        System.out.println(A.toString());

    }
}
