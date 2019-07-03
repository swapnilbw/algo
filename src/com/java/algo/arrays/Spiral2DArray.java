package com.java.algo.arrays;

public class Spiral2DArray {

    public static void main(String[] args) {
        printSpiralOrder(new int [][]{{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}});
    }

    private static void printSpiralOrder(int[][] A) {
        int L = A.length -1;
        int I = A.length /2 ;
        I = I ==0 ? 1 : I;

        for(int i=0; i < I ; i++){
            //print first row
            for(int j =i; j < L-i ; j++){
                System.out.println(A[i][j]);
            }
            //print last column
            for(int j =i;j < L-i; j++){
                System.out.println(A[j][L-i]);
            }
            //print last row
            for(int j = L-i; j>i;j--){
                System.out.println(A[L-i][j]);
            }
            //print first column in reverse
            for(int j = L-i;j > i ; j--){
                System.out.println(A[j][i]);
            }
        }
    }
}
