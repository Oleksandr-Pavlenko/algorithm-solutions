package com.algorithmen.binarySearch;


public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arrySum = 0;

        for (int num : nums) {
            arrySum += num;
        }
        return totalSum - arrySum;
    }
}
