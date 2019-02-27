package com.java.algo.arrays;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        // method to find Nth fibonacci number
        int resultFib = findFobonacci(7);
        System.out.println("Fibonacci number is "+resultFib);
        // print all fibonacci series
        printFibWithRecursion(10,0,1);
        System.out.println("");
        printFibWithIteration(10);

    }

    private static int findFobonacci(int n) {

        if(n < 3) return 1;

        return findFobonacci(n-2) + findFobonacci(n-1);
    }

    private static void printFibWithRecursion(int i,int prev,int curr) {
        if(i <= 0) return;

        System.out.print(curr+" ");
        printFibWithRecursion(i-1,curr,prev+curr);
    }
    private static void printFibWithIteration(int N) {
        int prev = 0; int curr = 1;
        for(int i = 0 ; i < N ; i++){
            System.out.print(curr+" ");
            int tmp  = prev;
            prev = curr;
            curr = curr + tmp;
        }
    }
    // using dyanamic programming
    private static int findFinDyana(int i) {

        if(i < 3) return 1;

        Map<Integer,Integer> aMap = new HashMap<>();
        int value1=0,value2=0;
        if(aMap.get(i-2)!=null){
            value1 = aMap.get(i-2);
        }else{
            value1 = findFinDyana(i-2);
        }
        if(aMap.get(i-1)!=null){
            value2 = aMap.get(i-1);
        }else{
            value2 = findFinDyana(i-1);
        }
        return value1 + value2;
    }
}
