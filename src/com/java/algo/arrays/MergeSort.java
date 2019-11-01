package com.java.algo.arrays;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] A = mergerSort(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(A));
        int B[] = mergerSort(new int[]{2, 3, 1, 4, 5, 4, 8,10});
        System.out.println(Arrays.toString(B));

    }


    private static  int[] mergerSort(int []A){
        // if A is small enough to sort
        if(A.length==1)
            return A;
        if(A.length==2){
            //sort if require
            if(A[0]>A[1]){
                int tmp = A[0];
                A[0] = A[1];
                A[1] = tmp;
            }
            return A;
        }

        int mid = A.length/2;
        return merge(mergerSort(Arrays.copyOfRange(A,0,mid)),mergerSort(Arrays.copyOfRange(A,mid,A.length)));
    }

    /**
     * merge 2 sorted array
     * @param left
     * @param right
     * @return
     */
    private static int [] merge(int[] left,int[] right) {
        int [] R = new int[left.length + right.length];
        int rIndex = 0,leftIndex=0,rightIndex=0;
        while( leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex]){
                R[rIndex++] = left[leftIndex++];
            }else{
                R[rIndex++] = right[rightIndex++];
            }
        }
        if(leftIndex != left.length){
            while(leftIndex < left.length){
                R[rIndex++] = left[leftIndex++];
            }
        }
        else if(rightIndex != right.length){
            while(rightIndex < right.length){
                R[rIndex++] = right[rightIndex++];
            }
        }
    return  R;
    }

}
