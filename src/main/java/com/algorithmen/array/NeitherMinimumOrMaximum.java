package com.algorithmen.array;

/*Given an integer array nums containing distinct positive integers, find and return any number from the array that is
neither the minimum nor the maximum value in the array, or -1 if there is no such number.

Return the selected integer.*/
public class NeitherMinimumOrMaximum {
    // Runtime beats 99%, memory 23%
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        for (int num : nums) {
            if (num != min && num != max) {
                return num;
            }
        }

        return -1;
    }
}
