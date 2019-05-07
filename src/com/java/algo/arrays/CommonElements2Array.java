package com.java.algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements2Array {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        Integer [] result = commonElements(array1A, array2A);// should return [1, 4, 9] (an array).


        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
         commonElements(array1B, array2B); //should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        commonElements(array1C, array2C);// should return [] (an empty array).
    }

    private static Integer[] commonElements(int[] A, int[] B) {
        int LL = 0;
        int LS = 0;
        int Aindex=0;
        int Bindex=0;
        List<Integer> CE = new ArrayList<>();
        while(Aindex< A.length && Bindex < B.length ){
            // check each element
            int V1 = A[Aindex];
            int V2 = B[Bindex];
            if(V1==V2){
                Aindex++;
                Bindex++;
                CE.add(V1);
            }else if(V1< V2){
                Aindex++;
            }else{
                Bindex++;
            }
        }
        System.out.println(CE.toString());
       return CE.toArray(new Integer[CE.size()]);
    }
}
