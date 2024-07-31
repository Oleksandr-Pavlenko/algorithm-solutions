package com.algorithmen.hashmap;

import java.util.HashMap;

public class PermutationDifferenceBetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int difference = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        for (int i = 0; i < t.length(); i++) {
            difference += Math.abs(map.get(t.charAt(i)) - i);
        }
        return difference;
    }
}
