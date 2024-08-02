package com.algorithmen.dynamicprogramming;

public class CountSortedVowelStrings {
    public int countVowelStrings(int n) {
        if (n <= 0) {
            return 0;
        }

        String vowels = "aeiou";
        int[] dp = new int[vowels.length()];

        for (int i = 0; i < 5; i++) {
            dp[i] = 1;
        }

        for (int length = 2; length <= n; length++) {
            for (int i = 3; i >= 0; i--) {
                dp[i] += dp[i + 1];
            }
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            count += dp[i];
        }

        return count;
    }

    public static void main(String[] args) {
        CountSortedVowelStrings csv = new CountSortedVowelStrings();
        csv.countVowelStrings(3);
    }
}
