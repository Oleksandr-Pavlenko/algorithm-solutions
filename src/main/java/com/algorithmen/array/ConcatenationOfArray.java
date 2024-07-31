package com.algorithmen.array;

import java.util.ArrayList;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int num : nums) {
            list.add(num);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
