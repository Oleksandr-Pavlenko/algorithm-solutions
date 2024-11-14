package com.algorithmen.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    // Approach 2
    // Runtime beats 100%, memory 37%
    public int singleNumber2(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    // Approach 1
    // Runtime beats 18%, memory 98%
    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("No element occurs exactly once");
    }
}
