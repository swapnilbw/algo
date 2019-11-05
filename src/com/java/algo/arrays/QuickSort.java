package com.java.algo.arrays;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] A = doQuickSort(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(A));
        int B[] = doQuickSort(new int[]{2, 3, 1, 4, 5, 4, 8});
        System.out.println(Arrays.toString(B));

    }

    private static int[] doQuickSort(int[] A) {
        // start with last element as pivotal
        doQuickSort(A, 0, A.length - 1);
        return A;
    }

    private static void doQuickSort(int[] A, int start, int end) {
        if (start < end) {
            //partition array where elements smaller than pivotal are left of array.
            int mid = partition(A, start, end);
            doQuickSort(A, start, mid - 1);
            doQuickSort(A, mid + 1, end);
        }
    }

    private static int partition(int[] A, int j, int P) {
        int i = j - 1;
        while (j <= P) {
            // swap elements less than pivot to left
            if (A[j] <= A[P]) {
                i++;
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
            j ++;
        }
        return i;
    }


}
