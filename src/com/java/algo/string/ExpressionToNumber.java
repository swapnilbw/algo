package com.java.algo.string;

import java.nio.charset.CharsetEncoder;
import java.util.*;

public class ExpressionToNumber {

    public static void main(String[] args) throws Exception {
        boolean isNumberMade = expressionToNumber("5+7*8-13", 48);
        System.out.println(isNumberMade);
    }

    private static boolean expressionToNumber(String S, int target) throws Exception {
        boolean sumFound = false;
        // create 2 Stacks one for numbers and one for operators
        LinkedList<Integer> numbersStack = new LinkedList<>();
        LinkedList<Character> operatorStack = new LinkedList<>();
        int eachDigit = 0;
        boolean isDigit = false;
        for (Character eachChar : S.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                eachDigit = eachDigit * 10 + (eachChar - '0');
                isDigit = true;
            } else {
                numbersStack.push(eachDigit);
                eachDigit = 0;
                isDigit = false;
            }
        }
        if(!isDigit) numbersStack.push(eachDigit);

        for (Character eachChar : S.toCharArray()) {
            if (!Character.isDigit(eachChar)) {
               operatorStack.push(eachChar);
            }
        }

        // read 2 values from number stack for each corresponding operator then add the result back to number stack
        int sum = 0;
        while (!numbersStack.isEmpty() && !operatorStack.isEmpty()) {
            // fetch first 2 numbers
            int count = 0;
            int firstNum = 0;
            int secondNum = 0;
            if (!numbersStack.isEmpty()) {
                firstNum = numbersStack.pollFirst();
            }
            if (!numbersStack.isEmpty()) {
                secondNum = numbersStack.pollFirst();
            }
            switch (((LinkedList<Character>) operatorStack).pollFirst()) {
                case '*':
                    sum = firstNum * secondNum;
                case '/':
                    sum = firstNum / secondNum;
                case '+':
                    sum = firstNum + secondNum;
                case '-':
                    sum = firstNum - secondNum;
            }
            numbersStack.push(sum);
        }
        if (sum == target) sumFound = true;
        System.out.println(sum);
        return sumFound;
    }


}
