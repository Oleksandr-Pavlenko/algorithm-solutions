package com.algorithmen.hashmap;

import java.util.*;

/*Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output*/
public class FindAllDuplicatesInAnArray {
    // Approach 2
    // Runtime beats 76%, memory 98%
    public List<Integer> findDuplicates2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Place each number in its correct position if it's not already there
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                duplicates.add(nums[index]);
            }
        }

        return duplicates;
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Approach 1
    // Runtime beats 14%, memory 6%
    public List<Integer> findDuplicates1(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                duplicates.add(nums[i]);
            }
            map.put(nums[i], i);
        }
        return duplicates;
    }
}
