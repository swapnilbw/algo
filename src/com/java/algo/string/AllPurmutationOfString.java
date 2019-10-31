package com.java.algo.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllPurmutationOfString {
    public static void main(String[] args) {
        Set<String> all =printAllPermutations("abcd“/.,l7.;o7kl;..........o;k0p;......…".toCharArray(),0);
        for(String each:all){
            System.out.println("here"+each);
        }
    }

    private static Set<String> printAllPermutations(char[] A,int C) {
        Set<String> combinations = new HashSet<>();


        if(A.length-1==C) return combinations;



        for (int j = 0; j < A.length; j++) {
            if(C==j) continue;
            swapChar(A,C,j);
            combinations.add(Arrays.toString(A));
            System.out.println(Arrays.toString(A));
            printAllPermutations(A,C+1);
        }
        return combinations;

    }

    private static void swapChar(char [] A,int C,int J){
        char tmp = A[C];
        A[C]  = A[J];
        A[J]  = tmp;
    }

    private static void findAllCombinations(char [] A,int C){

    }

    private static String swapFirstAndLast(String S,int j) {

        char[] A = S.toCharArray();
        A[0] = S.charAt(j);
        A[j] = S.charAt(0);
        return String.valueOf(A);
    }

}
