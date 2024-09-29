package com.algorithmen.string;

/*Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.*/
public class SplitAStringInBalancedStrings {
    // Runtime beats 100%, memory 38%
    public int balancedStringSplit(String s) {
        int balance = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                balance++;
            } else if (s.charAt(i) == 'L') {
                balance--;

            }
            if (balance == 0) {
                ans++;
            }
        }
        return ans;
    }
}
