package com.algorithmen.array;

import java.util.*;

public class IntersectionOfTwoArrays2 {
    // Approach 1
    // Runtime beats 27%, memory 28%
    public int[] intersect1(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
