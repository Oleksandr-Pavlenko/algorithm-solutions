package com.algorithmen.dynamicprogramming;

public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 1; i < ans.length; i++) {
            // Use bit operations to calculate the number of units
            // i >> 1 is division of i by 2 with discarding the remainder
            // i & 1 is checking the last bit of number i (1 if i is odd, otherwise 0)
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}
