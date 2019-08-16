package com.java.algo.string;

public class StringSearch {

    private static final int BASE = 10;

    public static void main(String[] args) {
        System.out.println(findSubString("2345","345"));
        System.out.println(findSubString("abcdcbab","cdc"));
    }
    private static boolean findSubString(String M,String S){
        int L = S.length();
        // find hash of substring
        int subHashCode = getHashCode(S);
        char [] A = M.toCharArray();
        // find rolling hash of sub string of main string
        int rollingHash = getHashCode(M.substring(0,S.length()));
        System.out.println("baseHash "+rollingHash);
        for(int prevIndex= 0,end=S.length();end < A.length; prevIndex++,end++){
            rollingHash = (rollingHash / BASE) - (A[prevIndex]-0) + (int)((A[end]-0)*Math.pow(BASE,L));
            if(rollingHash==subHashCode) return true;
        }
        return false;
    }
    private static int getHashCode(String S){
        char [] A = S.toCharArray();
        int hashCode = 0;
        for(int i =0; i < A.length ; i++){
            int intVal = A[i] - 0;
            hashCode += (intVal * Math.pow(BASE ,i+1));
        }
        return hashCode;
    }
}
