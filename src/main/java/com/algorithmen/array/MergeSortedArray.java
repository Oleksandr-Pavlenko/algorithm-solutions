/*
package com.leetcode.algorithmen.array;


import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length != m + n) {
            return;
        }

        int[] temp = new int[m + n];

        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            temp[m + i] = nums2[i];
        }

        Arrays.sort(temp);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            i++
        }
    }
}
*/
