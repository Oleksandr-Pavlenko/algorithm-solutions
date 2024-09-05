package com.algorithmen.array;

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.*/
public class RunningSumOf1dArray {
    //runtime beats 100%, memory 63%
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return nums;
        }

        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }
}
