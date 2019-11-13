package com.java.algo.string;

public class EditAwayStrings {
    public static void main(String[] args) {
        System.out.println("a".substring(1));
        int count = countEdits("abc", "b");
        System.out.println(count);
        count = countEdits("abcd", "xbc");
        System.out.println(count);
        count = countEdits("abcd", "xab");
        System.out.println(count);
    }


    private static int countEdits(String A,String B){
        // base condition
        if("".equals(A) && "".equals(B)) return 0;
        else if("".equals(A)) return B.length();
        else if("".equals(B)) return A.length();

        // if match no action require
        if(A.charAt(0)==B.charAt(0)){
            return countEdits(A.substring(1),B.substring(1));
        }
        // 3 operations , add , delete , replace -- pick min
        //add operation
        int l1 = 1+ countEdits(A.substring(1),B);
        // replace
        int l2 = 1 + countEdits(A.substring(1),B.substring(1));
        // delete
        int l3 = 1 + countEdits(A,B.substring(1));
        return findMin(l1,l2,l3);
    }

    private static int findMin(int l1, int l2, int l3) {
        return Math.min(Math.min(l1,l2),l3);
    }
}
