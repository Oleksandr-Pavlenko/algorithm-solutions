package com.algorithmen.sort;

import java.util.HashSet;

public class ContainsDuplicate {

    //This results in a time complexity of 𝑂(𝑛2), which can be very slow for large input arrays.
    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = true;
                    break;
                }
            }
        }
        return duplicate;
    }

    // This approach will reduce the time complexity to O(n) on average, which is much more efficient
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}
