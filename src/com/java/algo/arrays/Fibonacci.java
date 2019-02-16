package com.java.algo.arrays;

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
    }}
