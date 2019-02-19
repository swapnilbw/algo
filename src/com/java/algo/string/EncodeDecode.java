package com.java.algo.string;

public class EncodeDecode {

    public static void main(String[] args) {
        //aaaabcccaa
        String encodedStr = encodeString("aaaabcccaa");
        System.out.println(encodedStr);
         encodedStr = encodeString("a");
        System.out.println(encodedStr);
         encodedStr = encodeString("aaaaaaaaaaa");
        System.out.println(encodedStr);

        String decodeAgain = decodeString(encodedStr);
        System.out.println(decodeAgain);
    }

    private static String encodeString(String S) {
        StringBuilder SB = new StringBuilder();
        char[] A = S.toCharArray();
        int cnt = 1;
        for (int i = 1; i <= A.length; i++) {
            // find not matching char then append the previous char
            if (i==A.length || A[i - 1] != A[i]) {
                SB.append(cnt);
                SB.append(A[i - 1]);
                cnt = 1;
            } else { // A[i] == A[i-1]
                cnt++;
            }

        }
        return SB.toString();
    }

    private static String encodeString_(String in) {

        char[] A = in.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length; ) {
            char C = A[i];
            int cnt = 1;
            int next = ++i;
            while (next < A.length && C == A[next]) {
                cnt++;
                next = ++i;
            }
            sb.append(cnt).append(C);
        }
        return sb.toString();
    }

    private static String decodeString(String S) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < S.length(); i++) {

            if(Character.isDigit(S.charAt(i))){
                cnt = cnt *10 + S.charAt(i) - '0';
            }else{
                while(cnt > 0){
                    sb.append(S.charAt(i));
                    cnt--;
                }
            }
       }
        return sb.toString();
    }

}
