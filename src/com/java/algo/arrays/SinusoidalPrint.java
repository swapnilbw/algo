package com.java.algo.arrays;

public class SinusoidalPrint {

    public static void main(String[] args) {
        printSinusoidally(11);
    }
    private static void printSinusoidally(int T){

        // print first row
        for(int i =0,j=2; i <= T ; i++){
            if(i==j) {
                System.out.print(i);
                j =  i + 4;
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        //print second row
        for(int i=0,j=1;i <=T ; i++){
            if(i==j){
                System.out.print(i);
                j = i + 2;
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        //print third row
        for (int i =0,j = 4 ; i <=T ; i++){
            if(i==j){
                System.out.print(i);
                j = i + 4;
            }else{
                System.out.print(" ");
            }
        }
    }


}
