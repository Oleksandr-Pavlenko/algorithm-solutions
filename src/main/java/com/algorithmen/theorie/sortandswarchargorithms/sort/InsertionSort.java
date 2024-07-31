package com.algorithmen.theorie.sortandswarchargorithms.sort;

public class InsertionSort {
    public void insertionSort(int[] array){
        //imagine that the array on the left is sorted, so i=1
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            //Compare with the previous element in the conditional array
            int j = i - 1;
            ///Walk through the conditional array and write the value to the desired location
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
