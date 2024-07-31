package com.algorithmen.array;

import java.util.ArrayList;

public class FindTheOriginalArrayOfPrefixXor {
    public int[] findArray(int[] pref) {
        ArrayList<Integer> list = new ArrayList<>();
        if (pref.length == 0) {
            return new int[0];
        }

        list.add(pref[0]);

        for (int i = 1; i < pref.length; i++) {
            list.add(pref[i] ^ pref[i - 1]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
