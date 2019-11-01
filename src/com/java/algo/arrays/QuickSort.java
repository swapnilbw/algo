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

    private static int partition(int[] A, int start, int end) {
        int mid = start - 1;
        while (start <= end) {
            if (A[start] <= A[end]) {
                // swap mid and start
                mid++;
                int tmp = A[mid];
                A[mid] = A[start];
                A[start] = tmp;
            }
            start ++;
        }
        return mid;
    }


}
