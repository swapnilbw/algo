package com.java.algo.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        rotateArray(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

    private static void rotateArray(int[][] A){

        int L = A.length -1;
        System.out.println(Arrays.deepToString(A));

        for(int i = 0;i < L ; i++){

            for(int j = i; j < (L -i); j++){

                int tmp1 = A[i][j];
                int tmp2 = A[j][L-i];
                int tmp3 = A[L][L-j];
                int tmp4 = A[L-j][i];

                A[j][L-i] = tmp1;
                A[L][L-j] = tmp2;
                A[L-j][i] = tmp3;
                A[i][j] = tmp4;
            }
        }
        System.out.println(Arrays.deepToString(A));
    }
}
