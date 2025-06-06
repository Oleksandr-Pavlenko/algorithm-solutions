package com.algorithmen.array;

import java.util.ArrayList;
import java.util.List;

/*Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.*/
public class CreateTargetArrayInTheGivenOrder {
    // Runtime beats 100%, memory 67%
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}
