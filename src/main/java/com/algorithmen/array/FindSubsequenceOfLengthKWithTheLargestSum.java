package com.algorithmen.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.

Return any such subsequence as an integer array of length k.

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.*/


// time complexity 26%, memory 95%
public class FindSubsequenceOfLengthKWithTheLargestSum {
    static int[] maxSubsequence(int[] nums, int k) {
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Sort descending by value
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        // Take top k values
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            indices.add(pairs[i][1]);
        }

        // Sort by original index to maintain order
        Collections.sort(indices);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[indices.get(i)];
        }

        return result;
    }
}
