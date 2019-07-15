package com.java.algo.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LetterFromNewsPaper {
    public static void main(String[] args) {
        boolean isPossible = writeLetter("abcde", "aabbccddd");
        System.out.println(isPossible);
    }
    private static boolean writeLetter(String L, String N) {
        // create hash table for counting letters from LETTER
        Map counter = new HashMap<Character, Integer>();
        if(L.length() < N.length()) return false;
        for (int i = 0; i < L.length(); i++) {
            Character eachChar = L.charAt(i);
            if (counter.containsKey(eachChar)) {
                counter.put(eachChar, (int) counter.get(eachChar) + 1);
            } else {
                counter.put(eachChar, 1);
            }
        }
        for (int i = 0; i < N.length(); i++) {
            Character eachChar = N.charAt(i);
            // if char found , reduce the count by one
            if (counter.containsKey(eachChar)) {
                counter.put(eachChar, (int) counter.get(eachChar) - 1);
            }
        }
        // now iterate all the hashvalues to see if any positive number
        Set<Map.Entry> values = counter.entrySet();
        for (Map.Entry each : values ){
            if( (int)each.getValue() > 0) return false;
        }
        return true;
    }
}
