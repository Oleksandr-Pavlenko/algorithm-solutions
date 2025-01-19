package com.algorithmen.math;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(digits).boxed().toList());

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 9) {
                list.set(i, list.get(i) + 1);
                return list.stream().mapToInt(num -> num).toArray();
            } else {
                list.set(i, 0);
            }
        }

        list.addFirst(1);
        return list.stream().mapToInt(num -> num).toArray();
    }
}
