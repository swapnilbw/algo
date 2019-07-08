package com.java.algo.string;

public class SubString {

    public static void main(String[] args) {
        //System.out.println(findSubString("abcdabbccd", "abb"));
        System.out.println(findSubString("123456789", "234"));
    }

    private static boolean findSubString(String m,String n) {
        // find the finger print of substring and then search in main string for matching
        int M = m.length();
        int N = n.length();
        final int BASE = 10;
        int nH = getHash(n,BASE);
        System.out.println(nH);
        int mH = getHash(m.substring(0,N),BASE);
        for(int i =1; i < M-N ; i++){
            int rollingHash = getRollingHash(m,mH,i,BASE, N);
            if(nH == rollingHash ){ //&& n.equals(m.substring(i,N+i))
                return true;
            }
        }
        return false;
    }

    private static int getRollingHash(String m, int H,int i,int BASE, int N) {
        H -= m.charAt(i-1) * Math.pow(BASE,N-1);
        H*=BASE;
        H+= m.charAt(i+N-1);
        System.out.println("String "+m.substring(i,i+N) +" Rolling Hash "+H);

        return H;
    }

    private static int getHash(String s,int BASE) {
        int H = 0;
        for(int i =0; i < s.length(); i++){
            H += (s.charAt(i) * Math.pow(BASE,s.length()-(i+1)));
        }
        System.out.println("String "+s +" Hash "+H);
        return H;
    }
}
