package com.algorithmen.array;

public class LargestLocalValuesInAMatrix {
    public int[][] largestLocal(int[][] grid) {
        int[][] maxLocal = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid.length - 2; j++) {
                //init the lowest value
                int maxValue = Integer.MIN_VALUE;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        //compare this minimum value with all values and leave the maximum value
                        maxValue = Math.max(maxValue, grid[k][l]);
                    }
                }
                maxLocal[i][j] = maxValue;
            }
        }
        return maxLocal;
    }

    public void main(String[] args) {
        int[][] grid = {
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}
        };

        int[][] result = largestLocal(grid);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
