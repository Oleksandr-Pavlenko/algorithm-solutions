package com.algorithmen.sort;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        if (s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!hashMap.containsKey(t.charAt(i)) || hashMap.get(t.charAt(i)) == 0) {
                return false;
            }
            hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0) - 1);
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
