package com.java.algo.string;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        char result = getFirstNonRepeatingChar("abcab");
        System.out.println(result);
    }

    private static char getFirstNonRepeatingChar(String S) {
        char[] A = S.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char eachChar : A) {
            if (charMap.get(eachChar)!=null && charMap.get(eachChar) > 0) {
                charMap.put(eachChar, charMap.get(eachChar) + 1);
            } else {
                charMap.put(eachChar, 1);
            }
        }

        for(Map.Entry<Character,Integer> eachEntry : charMap.entrySet()){
            if(eachEntry.getValue()==1) return eachEntry.getKey();
        }
        return ' ';
    }

}
