package com.algorithmen.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int num1;
        int num2;
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                num2 = nums[j];
                if (num1 + num2 == target) {
                    System.out.println(i + " " + j);
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumSecondSolution(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                System.out.println(numMap.get(complement) + " " + i);
                return new int[]{numMap.get(complement), i};
            }

            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
