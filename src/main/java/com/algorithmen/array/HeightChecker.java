package com.algorithmen.array;

import java.util.Arrays;

/*A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].*/
public class HeightChecker {
    // Runtime beats 92%, memory 77%
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sortedHeights = heights.clone();

        Arrays.sort(sortedHeights);

        for (int i = 0; i < heights.length; i++) {
            if (sortedHeights[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
