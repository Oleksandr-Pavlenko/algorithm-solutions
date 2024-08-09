package com.algorithmen.array;


/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.*/
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    //runtime beats 75%
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        if (nums.length == 0) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
