package com.java.algo.arrays;

import java.util.Arrays;

/**
 * Select the smallest element and put in sorted side of array .
 * Repeatedly look for smallest element in unsorted part of array and add it to sorted part
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] A =doSelectionSort(new int[]{2,1,3});
        System.out.println(Arrays.toString(A));
         int B[] = doSelectionSort(new int[]{2,3,1,4,5,4,8});
        System.out.println(Arrays.toString(B));

    }

    private static int[] doSelectionSort(int[] A) {
        for(int i =0; i < A.length ; i++){
            int indexOfMin = findMinIndex(i,A);
            //swap min value at the end of sorted array
            swap(A,i,indexOfMin);
        }
        return A;
    }

    private static int findMinIndex(int start,int [] A){
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for(int i=start ; i < A.length;i++){
            if(A[i] < minValue){
                minValue = A[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int []A,int i,int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }


}
