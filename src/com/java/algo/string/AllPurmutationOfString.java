package com.java.algo.string;

public class AllPurmutationOfString {
    public static void main(String[] args) {
        printAllPermutations("abcd");
    }

    private static void printAllPermutations(String S) {
        for (int j = 0; j < S.length(); j++) {
            S = swapFirstAndLast(S,j);
            for (int i = 0; i < S.length(); i++) {
                System.out.println(S.substring(0, S.length() - i));
            }
        }

    }

    private static String swapFirstAndLast(String S,int j) {

        char[] A = S.toCharArray();
        A[0] = S.charAt(j);
        A[j] = S.charAt(0);
        return String.valueOf(A);
    }

}
