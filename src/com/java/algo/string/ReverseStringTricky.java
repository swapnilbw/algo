package com.java.algo.string;

import java.util.Arrays;

public class ReverseStringTricky {

    public static void main(String[] args) {
        // convert "alice likes bob --> bob likes alice"
        String reversedString = reverseString("alice likes bob");
        System.out.println(reversedString);
        System.out.println("bob likes alice".equals(reversedString));
        System.out.println(reverseUsingRecursion("alice"));
    }

    private static String reverseString(String S) {
        char [] A = S.toCharArray();
        // first reverse the whole string
        int start = 0;
        int end = A.length;
        reverseString(A,start,end);
        System.out.println(Arrays.toString(A));
        for(int i = 0 ; i < A.length ; ) {
            // reverse each string
            while(i < A.length && Character.isWhitespace(A[i])){
                start ++;i++;
            }
            end = start;
            while( i < A.length && !Character.isWhitespace(A[i])){
                end ++;i++;
            }
            // reverse string
            reverseString(A,start,end);
            start = end;
        }
        return String.valueOf(A);
    }
    private static void reverseString(char [] A,int start,int end){
        // swap char from start to end
        end = end -1;
        while(start < end){
            char tmp = A[start];
            A[start] = A[end];
            A[end] = tmp;
            start ++; end --;
        }
    }
    private static String reverseUsingRecursion(String S){ //abc
        if(S.length()==0) return "";
        return S.charAt(S.length()-1) + reverseUsingRecursion(S.substring(0,S.length()-1));
    }
}
