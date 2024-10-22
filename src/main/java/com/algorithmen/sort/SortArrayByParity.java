package com.algorithmen.sort;

import java.util.ArrayList;
import java.util.List;

/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.*/
public class SortArrayByParity {
    // Approach 2
    // Runtime beats 100%, memory 20%
    public int[] sortArrayByParity2(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }

    // Approach 2
    // Runtime beats 53%, memory 5%
    public int[] sortArrayByParity1(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int j : nums) {
            if (j % 2 == 0) {
                even.add(j);
            } else {
                odd.add(j);
            }
        }

        int[] result = new int[nums.length];
        int index = 0;

        for (int num : even) {
            result[index++] = num;
        }

        for (int num : odd) {
            result[index++] = num;
        }

        return result;
    }
}
