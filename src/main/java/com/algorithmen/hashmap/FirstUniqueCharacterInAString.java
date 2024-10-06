package com.algorithmen.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
public class FirstUniqueCharacterInAString {
    // Runtime beats 50%, memory 82%
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        char firstUniqChar = 0;

        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                firstUniqChar = key;
                break;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (firstUniqChar == s.charAt(i)){
                return i;
            }
        }

        return -1;
    }
}
