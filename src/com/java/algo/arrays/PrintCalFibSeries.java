package com.java.algo.arrays;

public class PrintCalFibSeries {

    public static void main(String[] args) {
        System.out.println(fibSeries(10));
        printFibSeries(5);
        System.out.println();
        printFibWithIteration(5);

    }

    private static int fibSeries(int i){

        if(i <= 2 ){
            return i-1;
        }
        return fibSeries(i-1) + fibSeries(i-2);
    }

    private static void printFibSeries(int n){
        printWithRecursion(0,1,n);
    }

    private static void printWithRecursion(int prev,int curr,int n){

        if(prev > n) return;
        System.out.print(" "+prev);
        printWithRecursion(curr,prev+curr,n);
    }

    private static void printFibWithIteration(int n){
        int prev = 0;int curr= 1; int tmp =0;

        while(prev <= n){
            System.out.print(" "+prev);
            tmp = prev;
            prev = curr;
            curr = tmp+ curr;
        }
    }
}
