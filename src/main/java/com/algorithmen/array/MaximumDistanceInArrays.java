package com.algorithmen.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*You are given m arrays, where each array is sorted in ascending order.
You can pick up two integers from two different arrays (each array picks one) and calculate the distance.
We define the distance between two integers a and b to be their absolute difference |a - b|.
Return the maximum distance.*/
public class MaximumDistanceInArrays {
    //runtime beats 100%
    public int maxDistance(List<List<Integer>> arrays) {
        if (arrays == null || arrays.isEmpty()) {
            return 0;
        }

        int maxDistance = 0;
        int minElement = arrays.getFirst().getFirst();  // Initialize with the first element of the first array (This will be the smallest element since the array is already sorted)
        int maxElement = arrays.getFirst().getLast();  // Initialize with the last element of the first array (This will be the largest element)

        for (int i = 1; i < arrays.size(); i++) {  // Start iterating from the second array (since we have already initialized the first array)
            List<Integer> currentArray = arrays.get(i);
            int currentMin = currentArray.getFirst();  // Get the first element of the current array (smallest)
            int currentMax = currentArray.getLast();  // Get the last element of the current array (largest)

            // Calculate the maximum distance between elements from different arrays
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - minElement));
            maxDistance = Math.max(maxDistance, Math.abs(maxElement - currentMin));

            // Update the global minElement and maxElement to account for the current array
            minElement = Math.min(minElement, currentMin);
            maxElement = Math.max(maxElement, currentMax);
        }

        return maxDistance;
    }


    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<List<Integer>>();
        List<Integer> fist = new ArrayList<>(Arrays.asList(-8, -7, -7, -5, 1, 1, 3, 4));
        List<Integer> second = new ArrayList<>(Arrays.asList(-10, -10, -7, 0, 1, 3));

        arrays.add(fist);
        arrays.add(second);

        MaximumDistanceInArrays array = new MaximumDistanceInArrays();
        System.out.println(array.maxDistance(arrays));
    }
}
