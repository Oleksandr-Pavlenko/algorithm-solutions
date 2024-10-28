package com.algorithmen.array;

import java.util.ArrayList;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    // Runtime beats 10%, memory 87%
    public int[] separateDigits1(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (num < 10) {
                list.add(num);
            } else {
                String numStr = String.valueOf(num);
                for (int j = 0; j < numStr.length(); j++) {
                    list.add(numStr.charAt(j) - '0');
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
