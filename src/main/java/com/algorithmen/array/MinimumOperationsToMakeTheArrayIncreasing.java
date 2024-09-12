package com.algorithmen.array;

/*You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.

For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
Return the minimum number of operations needed to make nums strictly increasing.

An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1.
An array of length 1 is trivially strictly increasing.*/
public class MinimumOperationsToMakeTheArrayIncreasing {
    //runtime beats 78%, memory 84%
    public static int minOperations(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                int diff = nums[i] - nums[i + 1];
                nums[i + 1] = nums[i + 1] + diff + 1;
                count += diff + 1;
            }
        }

        return count;
    }
}
