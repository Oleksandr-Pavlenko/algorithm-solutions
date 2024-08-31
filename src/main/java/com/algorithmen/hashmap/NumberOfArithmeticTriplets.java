package com.algorithmen.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

i < j < k,
nums[j] - nums[i] == diff, and
nums[k] - nums[j] == diff.
Return the number of unique arithmetic triplets.*/
public class NumberOfArithmeticTriplets {
    //runtime beats 83%, memory 9%
    public int arithmeticTripletsSecondSolution(int[] nums, int diff) {
        if (nums.length < 3) {
            return 0;
        }

        int tripletsCount = 0;
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            //nums[j] - nums[i] == diff
            //nums[j] = nums[i] + diff
            //nums[k] - nums[j] = diff
            //nums[k] = nums[j] + diff
            //nums[k] = (nums[i] + diff) + diff = nums[i] + 2 * diff
            //nums[j] = nums[k] - diff
            //nums[i] = nums[k] - 2 * diff
            if (numSet.contains(num - diff) && numSet.contains(num - 2 * diff)) {
                tripletsCount++;
            }
            numSet.add(num);
        }

        return tripletsCount;
    }


    //runtime beats 33%, memory 62%
    public int arithmeticTriplets(int[] nums, int diff) {
        if (nums.length < 3) {
            return 0;
        }

        int tripletsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        tripletsCount++;
                    }
                }
            }
        }
        return tripletsCount;
    }
}
