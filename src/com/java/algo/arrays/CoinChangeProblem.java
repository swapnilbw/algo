package com.java.algo.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * How many unique combinations of coins to make a change for given number
 * example- {1,2,3,4} for $ 4
 */
public class CoinChangeProblem {

    public static void main(String[] args) {
        int [] coins = {1,2,3,4};
        int amount = 4;
        System.out.println("Total unique combinations "+coinChange(coins,amount,0));
    }

    private static int coinChange(int[] coins, int amount,int currIndex) {
        int combination = 0;
        if(amount == 0) {
            return 1;
        }
        if(amount < 0)
            return 0;

        for(int i = currIndex;i < coins.length ; i++){
            combination+= coinChange(coins,amount-coins[i],i);
        }
        return  combination;
    }
}
