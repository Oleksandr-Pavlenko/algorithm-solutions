package com.algorithmen.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/*You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.

You repeat the following procedure n / 2 times:

Remove the smallest element, minElement, and the largest element maxElement, from nums.
Add (minElement + maxElement) / 2 to averages.
Return the minimum element in averages.*/
public class MinimumAverageOfSmallestAndLargestElements {
    //runtime beats 31%, memory 38%
    public double minimumAverage(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        ArrayList<Double> averages = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length / 2; i++) {
            int minElement = nums[i];
            int maxElement = nums[nums.length - 1 - i];
            averages.add((minElement + maxElement) / 2.0);
        }

        return Collections.min(averages);
    }
}
