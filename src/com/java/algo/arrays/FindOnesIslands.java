package com.java.algo.arrays;
/**
 * Island Count
 * Given a 2D array binaryMatrix of 0s and 1s, implement a function getNumberOfIslands that returns the number of islands of 1s in binaryMatrix.
 *
 * An island is defined as a group of adjacent values that are all 1s. A cell in binaryMatrix is considered adjacent to another cell if they are next to each either on the same row or column. Note that two values of 1 are not part of the same island if they’re sharing only a mutual “corner” (i.e. they are diagonally neighbors).
 *
 * Explain and code the most efficient solution possible and analyze its time and space complexities.
 *
 * Example:
 *
 * input:  binaryMatrix = [ [0,    1,    0,    1,    0],
 *                          [0,    0,    1,    1,    1],
 *                          [1,    0,    0,    1,    0],
 *                          [0,    1,    1,    0,    0],
 *                          [1,    0,    1,    0,    1] ]
 *
 * output: 6 # since this is the number of islands in binaryMatrix.
 *           # See all 6 islands color-coded below.
 */

import java.io.*;
import java.util.*;

class FindOnesIslands {

    static int getNumberOfIslands(int[][] M) {
        int totalIslands = 0;
        // check on each element in matrix and do DFS for connected islands of 1
        for(int i =0;i  < M.length ; i++){
            for(int j = 0; j < M.length ; j++){
                if(M[i][j]==1) {
                    totalIslands ++;
                    // set all connected 1 to -1
                    reSetIsland(M,i,j);
                }
            }
        }
        return totalIslands;

    }
    private static void reSetIsland(int [][] M, int i , int j){
        if((i < 0 || i > (M.length-1) || j <0 || j > (M.length-1)) || M[i][j] != 1) return;
        if(M[i][j] == 1) M[i][j] = -1;
        reSetIsland(M,i+1,j);
        reSetIsland(M,i-1,j);
        reSetIsland(M,i,j+1);
        reSetIsland(M,i,j-1);
    }

    public static void main(String[] args) {
        int [][] A = {{0,1,0,1,0},
                {0,0,1,1,1},
                {1,0,0,1,0},
                {0,1,1,0,0},
                {1,0,1,0,1}};
        System.out.println(getNumberOfIslands(A));
    }

}