package com.algorithmen.hashmap;

import java.util.HashSet;
import java.util.Set;

/*Given a string s, return the maximum number of unique substrings that the given string can be split into.

You can split string s into any list of non-empty substrings, where the concatenation of the substrings forms the original string. However, you must split the substrings such that all of them are unique.

A substring is a contiguous sequence of characters within a string.*/
public class SplitAStringIntoTheMaxNumberOfUniqueSubstrings {
    // Runtime beats 74%, memory 46%
    public int maxUniqueSplit(String s) {
        Set<String> seen = new HashSet<>();

        return backtrack(s, 0, seen);
    }

    private int backtrack(String s, int start, Set<String> seen) {
        if (start == s.length()) {
            return seen.size();
        }

        int maxSplits = 0;

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);

            if (!seen.contains(substring)) {
                seen.add(substring);

                maxSplits = Math.max(maxSplits, backtrack(s, end, seen));

                seen.remove(substring);
            }
        }
        return maxSplits;
    }
}
