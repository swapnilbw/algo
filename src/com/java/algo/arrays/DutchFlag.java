package com.java.algo.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DutchFlag {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dutchFlag(new int[]{1,2,3,1,1,2,3,2,3,1})));
    }

    private static int[] dutchFlag(int[] A) {
        // first loop move elements less than pivot to left of array
        int P = 2;
        int L = 0;
        int M = A.length-1;

        for (int i=0;i < A.length ; i++){
            if(A[i] < P)
                // swap the elements
                swapE(A,i,L++);
        }

        // now swap the elements greater than P to right on array

        for(int i = A.length -1 ; i > 0 ; i--){
            if(A[i] > P){
                swapE(A,i,M--);
            }
        }
        return A;
    }

    private static void swapE(int[] A, int i, int j) {
        // swap elements
         int tmp = A[i];
         A[i] =  A [j];
         A[j] = tmp;
    }
}
