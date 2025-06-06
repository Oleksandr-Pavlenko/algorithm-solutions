package com.algorithmen.sort;

import java.util.Arrays;

/*You are given a 0-indexed integer array nums of even length and there is also an empty array arr. Alice and Bob decided
to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:

        Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
        Now, first Bob will append the removed element in the array arr, and then Alice does the same.
The game continues until nums becomes empty.
Return the resulting array arr.*/
public class MinimumNumberGame {
    // Runtime beats 98%, memory 64%
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        int a = 0, b = 1;

        while (b < nums.length) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a = b + 1;
            b = a + 1;
        }

        return nums;
    }
}
