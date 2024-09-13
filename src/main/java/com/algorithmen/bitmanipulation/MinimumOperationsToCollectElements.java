package com.algorithmen.bitmanipulation;

import java.util.*;


/*You are given an array nums of positive integers and an integer k.

In one operation, you can remove the last element of the array and add it to your collection.

Return the minimum number of operations needed to collect elements 1, 2, ..., k.*/
public class MinimumOperationsToCollectElements {

    //runtime beats 99%, memory 77%
    public static int minOperations1(List<Integer> nums, int k) {
        int counter = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= k; i++) {
            list.add(i);
        }
        for(int i = nums.size()-1; i >= 0; i--) {
            if(!list.isEmpty()){
                list.remove(nums.get(i));
                counter++;
            }
        }
        return counter;
    }
}
