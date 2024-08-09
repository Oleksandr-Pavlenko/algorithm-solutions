package com.algorithmen.hashmap;

/*You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive integer k.

A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).

Return the total number of good pairs.*/
public class FindTheNumberOfGoodPairsI {
    //runtime beats 100%
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0 || k <= 0) {
            return 0;
        }

        int count = 0;

        for (int value1 : nums1) {
            for (int value2 : nums2) {
                if (value1 % (value2 * k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
