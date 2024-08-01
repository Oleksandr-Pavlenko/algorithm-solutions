package com.algorithmen.hashmap;

import java.util.*;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        while (!countMap.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                row.add(entry.getKey());
                if (entry.getValue() == 1) {
                    iterator.remove();
                } else {
                    countMap.put(entry.getKey(), entry.getValue() - 1);
                }
            }
            res.add(row);
        }
        return res;
    }
}

