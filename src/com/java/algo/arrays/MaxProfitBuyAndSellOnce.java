package com.java.algo.arrays;

import java.util.Arrays;
import java.util.List;

public class MaxProfitBuyAndSellOnce {

    public static void main(String[] args) {
        int maxProfit = getMaxProfit(Arrays.asList(12,14,88,2,43,74,7,84,99));
        System.out.println("Success "+(maxProfit==97));
    }

    private static int getMaxProfit(List<Integer> asList) {
        int M = Integer.MAX_VALUE;
        int MX = Integer.MIN_VALUE;
        int P = 0;

        for(int i = 1; i < asList.size(); i++){
            M = Math.min(M,asList.get(i-1));
            MX = Math.max(MX,asList.get(i));
            P = Math.max(P,MX-M);
        }
        return P;
    }
}
