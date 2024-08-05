package com.algorithmen.hashmap;

import java.util.*;

/*A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.*/


public class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return "";
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        //do this and not through Map.Entry<String, Integer> entry : map.entrySet(), since the order is important
        ArrayList<String> distinctList = new ArrayList<>();
        for (String s : arr) {
            if (map.get(s) == 1) {
                distinctList.add(s);
            }
        }

        if (distinctList.size() < k) {
            return "";
        } else {
            return distinctList.get(k - 1);
        }
    }
}
