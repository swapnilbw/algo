package com.java.algo.string;

import java.util.Arrays;
public class AllPurmutationOfString {
    public static void main(String[] args) {
       // printAllPermutations("abcd".toCharArray(),1);
        printAllPermutations_recursion("abc".toCharArray());
    }

    private static void printAllPermutations(char[] A,int L) {
        if (A.length == L)
            return ;

        char tmp = A[A.length-1];
        A[A.length-1] = A[0];
        A[0] = tmp;

        for(int i =0;i < A.length;i++) {
            printAllPermutations(A,i);
        }
        System.out.println(Arrays.toString(A));

    }
    private static void printAllPermutations_recursion(char[] A) {
        for (int j = 0; j < A.length; j++) {
            printAllPermutations_recursion(A);
        }
    }

    private static void printAllPermutations_old(String S) {
        for (int j = 0; j < S.length(); j++) {
            S = swapFirstAndLast(S, j);
            for (int i = 0; i < S.length(); i++) {
                System.out.println(S.substring(0, S.length() - i));
            } }
        return combinations;

    }

    private static void swapChar(char [] A,int C,int J){
        char tmp = A[C];
        A[C]  = A[J];
        A[J]  = tmp;
    }

    private static void findAllCombinations(char [] A,int C){

    }

    private static String swapFirstAndLast(String S, int j) {

        char[] A = S.toCharArray();
        A[0] = S.charAt(j);
        A[j] = S.charAt(0);
        return String.valueOf(A);
    }

}
