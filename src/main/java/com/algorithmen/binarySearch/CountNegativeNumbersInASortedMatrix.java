package com.algorithmen.binarySearch;

/*Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number
of negative numbers in grid.*/
public class CountNegativeNumbersInASortedMatrix {
    //runtime beats 100%, memory 31%
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            int left = 0;
            int right = grid[i].length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (grid[i][mid] < 0) {
                    count += (right - mid + 1);
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return count;
    }
}
