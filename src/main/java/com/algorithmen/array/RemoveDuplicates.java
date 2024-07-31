package com.algorithmen.array;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList();

        HashSet<ArrayList> hashSet = new HashSet();

        for (int i = 1; i < nums.length; i++) {
            arrayList.add(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j+1]) {
                    arrayList.add(nums[i]);
                }
            }
        }
        return arrayList.size();
    }
}
