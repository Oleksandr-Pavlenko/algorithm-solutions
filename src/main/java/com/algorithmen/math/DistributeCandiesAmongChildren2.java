package com.algorithmen.math;

/*You are given two positive integers n and limit.

Return the total number of ways to distribute n candies among 3 children such that no child gets more than limit candies.*/

//runtime beats 31%, memory 32%
public class DistributeCandiesAmongChildren2 {
    public long distributeCandies(int n, int limit) {
        long ans = 0;
        for (int i = 0; i <= Math.min(limit, n); i++) {
            if (n - i > 2 * limit) {
                continue;
            }
            ans += Math.min(n - i, limit) - Math.max(0, n - i - limit) + 1;
        }
        return ans;
    }
}
