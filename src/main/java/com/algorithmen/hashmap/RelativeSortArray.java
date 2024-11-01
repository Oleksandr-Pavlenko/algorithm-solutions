package com.algorithmen.hashmap;

import java.util.*;

/*Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.*/
public class RelativeSortArray {
    // Runtime beats 41, memory 34%
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            int frequency = frequencyMap.get(num);
            for (int i = 0; i < frequency; i++) {
                result.add(num);
            }
            frequencyMap.remove(num);
        }

        List<Integer> remainingElements = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(remainingElements);
        for (int num : remainingElements) {
            int frequency = frequencyMap.get(num);
            for (int i = 0; i < frequency; i++) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}
