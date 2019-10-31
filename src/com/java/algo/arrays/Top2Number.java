package com.java.algo.arrays;

public class Top2Number {
    public static void main(String[] args) {
        findTopNumbers(new int[]{2,4,6,99,28,9});
        System.out.println("Max profit is "+findMaxProfit(new int[]{10,28,8,7,14,15,21,55,3}));
    }
    private static void findTopNumbers(int A[]){

        int max1 = -1;
        int max2 = -1;

        for(int i= 1; i < A.length ; i++){

            if(A[i] > max1){
                max2= max1;
                max1 = A[i];
                System.out.println("Max1 is "+max1+" max 2 is "+max2);
            }else {
                max2 = Math.max(max2, A[i]);
            }
        }
        System.out.println("Max1 is "+max1+" max 2 is "+max2);

    }

    public static int findMaxProfit(int []dailyMarketPrice){
        int maxprofit = 0;
        int minPurchasePrice = dailyMarketPrice[0];
        for (int i=1;i<dailyMarketPrice.length;i++){
            int tempmaxprofit = dailyMarketPrice[i]-minPurchasePrice;
            if(tempmaxprofit>maxprofit){
                minPurchasePrice = dailyMarketPrice[i];
                maxprofit = tempmaxprofit;
            }
        }

        return maxprofit;
    }
}
