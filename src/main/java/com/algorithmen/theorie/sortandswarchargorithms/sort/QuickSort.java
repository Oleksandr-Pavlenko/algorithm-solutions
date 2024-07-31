package com.algorithmen.theorie.sortandswarchargorithms.sort;

public class QuickSort {

    public void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int i = leftIndex;
            int j = rightIndex;

            int pivot = arr[leftIndex + (rightIndex - leftIndex) / 2];

            while (i < j) {
                //start going to the pivot from both sides
                //walk -> left to the pivot, if the value is less than the pivot value
                while (arr[i] < pivot) {
                    i++;
                }
                // go <- to the right of the pivot if the value is less than the pivot value
                while (arr[j] > pivot) {
                    j--;
                }
                // If the found elements are not in their places, change their places
                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            // Recursive call for the left part of the array
            if (leftIndex < j) {
                quickSort(arr, leftIndex, j);
            }
            // Recursive call for the right part of the array
            if (rightIndex > i) {
                quickSort(arr, i, rightIndex);
            }
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"A", "B", "C", "D", "E", "F"};
        main(strArr);
    }
}
