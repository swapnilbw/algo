package com.java.algo.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class FindMissingInteger {
    public static void main(String[] args) {
        Stream<Integer> range1To100 = Stream.iterate(1,a-> a+1);
        Integer[] A =  range1To100.limit(100).map(Object::toString).map(Integer::parseInt).toArray(Integer[]::new);
        int removeIndex = new Random().nextInt(100);
        System.out.println("removeIndex "+removeIndex);
        A[removeIndex] = 0;
        int missingInteger = findMissingInteger(A);
        System.out.println(missingInteger);
        missingInteger = findMissingIntUsingSum(A);
        System.out.println(missingInteger);
    }

    private static int findMissingInteger(Integer[] A) {
        // add each entry to respective index
        int[] newArray = new int[101];
        for(Integer eachInt : A){
            newArray[eachInt]  = eachInt;
        }
        // now find the missing integer
        int missingInt = 0;
        for(int i = 1; i < newArray.length ; i++){
            if(newArray[i]==0) {
                missingInt = i;
                break;
            };
        }
        return missingInt;
    }

    private static int findMissingIntUsingSum(Integer[] A){
        int sumOf1To100 =  (A.length * ( A.length+1))/2;  // (100*(100+1)) / 2; --> n ( n + 1 ) / 2
        int currSum = 0;
        for(int eachInt : A){
            currSum += eachInt;
        }
        return sumOf1To100 - currSum;
    }
}
