package com.algorithmen.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        // The first row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            // The first element of each row is always 1
            currentRow.add(1);

            // Each triangle element (except the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and above-and-to-the-right.
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            // The last element of each row is always 1
            currentRow.add(1);

            triangle.add(currentRow);
        }

        return triangle;

    }

    public static void main(String[] args) {
        PascalsTriangle triangle = new PascalsTriangle();
        int numRows = 5;
        List<List<Integer>> result = triangle.generate(numRows);

        // Печать результата
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
