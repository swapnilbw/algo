package com.java.algo.arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println(addPlusOne("12").equals("13"));
        System.out.println(addPlusOne("99").equals("100"));
        System.out.println(addPlusOne("29").equals("30"));
    }

    private static String addPlusOne(String S){

        // if last char is less than 9
        char [] A = S.toCharArray();
        int lastD = A[A.length-1] - '0';
        if(lastD<9) {
            lastD = lastD + 1;
            A[A.length-1] = (char)(lastD + '0');
            return String.valueOf(A);
        }
        // if last char is equal to 9
        int R = 1;
        StringBuilder SB = new StringBuilder();
        for(int i = A.length-1;i >= 0; i--){
            int sum = (A[i]-'0') + R;
            if(sum > 9) {
                SB.append('0');
                R = 1;
            }else {
                SB.append(sum);
                R = 0;
            }
        }
        if(R > 0) SB.append('1');
        SB.reverse();
        return SB.toString();
    }
}
