package com.algorithmen.hashmap;

import java.util.HashSet;
import java.util.Set;

/*You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.*/
public class CountTheNumberOfConsistentStrings {
    // Runtime beats 51%, memory 8%
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;

        Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                ans++;
            }
        }

        return ans;
    }
}
