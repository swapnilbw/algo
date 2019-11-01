package com.java.algo.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int A[] = sort(new int[]{2,3,1,4,5,4,8});
  //      int A[] = sort(new int[]{2,3,1});
        System.out.println(Arrays.toString(A));
    }

    private static int[] sort(int A[]){

        // loop through all element and push the larger element to right of the array
        for(int i =0 ; i < A.length; i++){

            for(int j=1; j < (A.length-i) ; j++){
                if(A[j-1] > A[j]){
                    swap(A,j-1,j);
                }

            }
        }
        return A;
    }

    private static void swap(int []A,int i , int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
