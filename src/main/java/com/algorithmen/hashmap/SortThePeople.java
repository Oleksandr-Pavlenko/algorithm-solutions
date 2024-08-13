package com.algorithmen.hashmap;

import java.util.*;

/*You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.*/
public class SortThePeople {
    //runtime beats 51%
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] indices = new Integer[heights.length];

        for (int i = 0; i < heights.length; i++) {
            indices[i] = i;
        }

        // Sort the indices based on the heights in descending order
        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]);

        // Create the final array of names based on the sorted indices
        String[] sortedNames = new String[names.length];
        for (int i = 0; i < indices.length; i++) {
            sortedNames[i] = names[indices[i]];
        }

        return sortedNames;
    }

    public static void main(String[] args) {
        SortThePeople sorter = new SortThePeople();
        String[] names = {"Alice", "Bob", "Bob"};
        int[] heights = {155, 185, 150};

        String[] sortedNames = sorter.sortPeople(names, heights);
        System.out.println(Arrays.toString(sortedNames)); // Ожидаемый вывод: ["Bob", "Alice", "Bob"]
    }
}
