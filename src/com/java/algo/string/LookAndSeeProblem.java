package com.java.algo.string;

public class LookAndSeeProblem {
    public static void main(String[] args) {
        String R = testLookAndFeel(5, "1");
        System.out.println(R);
    }

    private static String testLookAndFeel(int N, String S) {

        for (int i = 0; i < N; i++) {
            S = lookAndFeel(S);
        }
        return S;
    }

    private static String lookAndFeel(String s) {
        char[] A = s.toCharArray();
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i <= A.length - 1; i++) {
            int counter = 1;
            while (i + 1 <= A.length - 1 && A[i] == A[i + 1]) {
                counter++;
                i++;
            }
            SB.append(counter).append(A[i]);
        }
        return SB.toString();
    }


}
