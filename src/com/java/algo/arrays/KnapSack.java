package com.java.algo.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given different items and respective weights and profits
 * Find max profit by selling the items of given weight
 * <p>
 * Items { Mango , Apple , Banana , Orange }
 * Profits { 31,26,72,17}
 * Weights {3,1,5,2}
 * KnapSack capacity 7
 */
public class KnapSack {
    public static void main(String[] args) {
        int[] weights = {3, 1, 5, 2};
        int[] profits = {31, 26, 72, 17};

        int maxProfit = findMaxProfit(weights, profits, 7, 0);
        System.out.println(maxProfit);
    }

    static  int findMaxProfit(int[] weights, int[] profits, int capacity, int currIndex) {
        int profitA = 0;
        int profitB = 0;
        // base condition
        if(currIndex>weights.length-1) return 0;

        // 2 choices any every index - chose or not to chose
        // 1. chose weight if have capacity
        if (capacity >= weights[currIndex])
            profitA += profits[currIndex] + findMaxProfit(weights, profits, capacity - weights[currIndex], currIndex + 1);
        // 2. not to chose
            profitB += findMaxProfit(weights, profits, capacity, currIndex+1);
        return Math.max(profitA, profitB);
    }

}
