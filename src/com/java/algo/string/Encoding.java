package com.java.algo.string;

public class Encoding {

    public static void main(String[] args) {
        String result = encode("aaabbbccccccd");
        System.out.println(result);
        result = encode("aaabbbccccddd");
        System.out.println(result);
    }

    private static String encode(String S) {
        StringBuilder SB = new StringBuilder();
        int C = 1;
        for (int i = 1; i <= S.length(); i++) {

            //if chars are not - equal or end of string append to buffer else increase the counter
            if(i==S.length() || S.charAt(i-1)!=S.charAt(i)){
                SB.append(C).append(S.charAt(i-1));
                C=1;
            }else{
                C++;
            }
        }
        return SB.toString();
    }

}
