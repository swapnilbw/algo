package com.java.algo.string;

public class EncodeDecode {

    public static void main(String[] args) {
        //aaaabcccaa
        String encodedStr = encodeString("aaaabcccaa");
        System.out.println(encodedStr);
        String decodeAgain = decodeString(encodedStr);
        System.out.println(decodeAgain);
    }

    private static String encodeString(String in) {

        char[] A = in.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length; ) {
            char C = A[i];
            int cnt = 1;
            int next = ++i;
            while (next < A.length && C == A[next] ) {
                cnt++; next = ++i;
            }
            sb.append(cnt).append(C);
        }
        return sb.toString();
    }

    private static String decodeString(String S){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < S.length();i++){

            int num = S.charAt(i) - '0'; i++;
            char C = S.charAt(i);

            while(num > 0){
                num --;
                sb.append(C);
            }
        }
        return sb.toString();
    }

}
