package com.algorithmen.hashmap;

import java.util.HashMap;
import java.util.Map;

/*Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

x if x >= 0.
-x if x < 0.*/
public class CountNumberOfPairsWithAbsoluteDifferenceK {
    // Approach 2
    // Runtime beats 93%, memory 34%
    public int countKDifference2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int num : nums) {
            if (map.containsKey(Math.abs(num - k))) {
                ans += map.get(Math.abs(num - k));
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }

    // Approach 2
    // Runtime beats 52%, memory 40%
    public int countKDifference1(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
