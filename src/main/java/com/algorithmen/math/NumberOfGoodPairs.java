package com.algorithmen.math;


/*Given an array of integers nums, return the number of good pairs.

        A pair (i, j) is called good if nums[i] == nums[j] and i < j.*/
public class NumberOfGoodPairs {

    //Runtime beats 88%
    public int numIdenticalPairs(int[] nums) {
        if (nums.length == 0) return 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
