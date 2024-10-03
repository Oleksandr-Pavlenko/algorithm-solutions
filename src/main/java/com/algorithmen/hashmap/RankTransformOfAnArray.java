package com.algorithmen.hashmap;

import java.util.*;

/*Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.*/
public class RankTransformOfAnArray {
    // Runtime beats 97%, memory 45%
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sortedArr = arr.clone();

        Arrays.sort(sortedArr);

        int rank = 1;
        for (int value : sortedArr) {
            if (!map.containsKey(value)) {
                map.put(value, rank++);
            }
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
