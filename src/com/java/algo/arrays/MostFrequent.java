package com.java.algo.arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public static void main(String[] args) {
        int result = findMostFrequent(new int[]{1,2,3,1,2,1,3});
        System.out.println(result);
    }

    private static int findMostFrequent(int[] A) {
        Map<Integer,Integer> M = new HashMap<>();
        int mostFre = 0; int max = 0;
        for(int E : A){
            if(M.containsKey(E)){
                int currValue = M.get(E);
                currValue=currValue+1;
                M.put(E,currValue);
                if(currValue>max){
                    max = currValue;
                    mostFre = E;
                }
            }else{
                M.put(E,1);
            }
        }
        return mostFre;
    }
}
