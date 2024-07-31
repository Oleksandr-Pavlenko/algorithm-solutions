package com.algorithmen.math;


public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    //runtime beats 23%
    //memory beats 95%
    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if ((num - 1) % 3 == 0) {
                result++;
            }
            if ((num + 1) % 3 == 0) {
                result++;
            }
        }
        return result;
    }

    public int minimumOperations1(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                    result++;
            }
        }
        return result;
    }
}
