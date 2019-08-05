package com.java.algo.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        System.out.println(findDuplicateInArray(new int[]{1,2,3,3,4,4,5}));
        System.out.println(findLastDuplicateInArray(new int[]{1,2,3,3,4,4,5}));

    }
    private static int findDuplicateInArray(int [] A){
        Map<Integer,Integer> M = new HashMap<>();

        for(int eachInt : A){
            if(M.containsKey(eachInt)){
                return eachInt;
            }
            M.put(eachInt,eachInt);
        }
        return -1;
    }
    private static int findLastDuplicateInArray(int [] A){
        Map<Integer,Integer> M = new HashMap<>();

        for(int i=(A.length-1) ; i >= 0 ; i--){
            if(M.containsKey(A[i])){
                return A[i];
            }
            M.put(A[i],A[i]);
        }
        return -1;
    }
}
