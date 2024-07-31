package com.algorithmen.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey() - a.getKey();  // If the values are equal, sort by descending keys
            } else {
                return a.getValue() - b.getValue(); // Otherwise sort by ascending values
            }
        });

        int[] result = new int[nums.length];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : list) {
            int num = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};

        SortArrayByIncreasingFrequency sortArrayByIncreasingFrequency = new SortArrayByIncreasingFrequency();
        sortArrayByIncreasingFrequency.frequencySort(nums);
    }
}
