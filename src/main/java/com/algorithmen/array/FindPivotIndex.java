package com.algorithmen.array;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int pivotLeft = 0;
        int pivotRight = 0;
        if (nums.length /2 == 0 || nums.length == 1) {
            return 0;
        }

        for (int i = 0; i < nums.length / 2; i++) {
            pivotLeft = pivotLeft + nums[i];
        }
        for (int i = nums.length / 2; i < nums.length; i++) {
            pivotRight = pivotRight + nums[i];
        }

        if (pivotLeft == pivotRight) {
            return pivotRight;
        }
        return -1;
    }
}
