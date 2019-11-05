package com.java.algo.arrays;

public class HouseThief {
    public static void main(String[] args) {
        int result =  findMaxWealth(new int [] {6,7,1,30,8,2,4},0);
        System.out.println(result);
        result =  findMaxWealth(new int [] {10,5,1,13,6,11,40},0);
        System.out.println(result);
        result =  findMaxWealth(new int [] {1,7,8,6,20,18,4},0);
        System.out.println(result);
    }

    private static int findMaxWealth(int[] A,int index) {

        if(A.length-1-index==0) return 0;
        if(A.length-1-index==1) return A[A.length-1];

        // either choose 1 house or skip first house
        return Math.max(A[index] + findMaxWealth(A,index+2),findMaxWealth(A,index+1));
    }

}
