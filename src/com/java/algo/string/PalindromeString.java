package com.java.algo.string;

public class PalindromeString {
    public static void main(String[] args) {
        boolean result = isPalindrome("I am TOT ma I");
        System.out.println(result);
    }

    private static boolean isPalindrome(String S) {

        for (int i = 0, j = S.length() - 1; i < j; i++, j--) {
            if (S.charAt(i) != S.charAt(j)) return false;
        }
        return true;
    }
}
