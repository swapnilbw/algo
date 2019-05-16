package com.java.algo.arrays;

public class RotationOfAnother {
    public static void main(String[] args) {
        boolean result = isRotation(new int []{1,2,3,4,5},new int []{3,4,5,1,2});
        result = isRotation(new int []{1,2,3,4,5},new int []{3,2,5,1,2});
        System.out.println(result);
    }

    private static boolean isRotation(int [] A ,int [] B) {
        // check length
        if(A.length != B.length) return false;
        // check if A first element exists in B
        int A1=  A[0];
        boolean found = true;
        for(int i=0 ; i < A.length;i ++){
            if(A1==B[i]){
                for(int j=0;j < A.length;j++){
                    if(A[j] != B[(i+j)%A.length]) return false;
                }
            }
        }
        return true;
    }
}
