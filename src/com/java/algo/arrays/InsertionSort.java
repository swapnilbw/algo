package com.java.algo.arrays;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] A = insertionSort(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(A));
        int B[] = insertionSort(new int[]{2, 3, 1, 4, 5, 4, 8});
        System.out.println(Arrays.toString(B));

    }

    private static int[] insertionSort(int[] A) {

        // pick the last element insert in right position ( swap with higher element) - repeat for next element
        for (int i = A.length - 1; i > 0; i--) {

            // find the right position for i
            int insertIndex = findInsertIndex(A, i);
            if(i != insertIndex) {
                swapToRightPosition(A, insertIndex, i);
                i++;
            }
        }
        return A;
    }

    private static void swapToRightPosition(int[] A, int insertIndex, int i) {
        int tmp = A[insertIndex];
        A[insertIndex] = A[i];
        A[i] = tmp;
    }

    private static int findInsertIndex(int[] A, int index) {
        for (int i = 0; i < index; i++) {
            if (A[i] > A[index])
                return i;
        }
        return index;
    }
}
