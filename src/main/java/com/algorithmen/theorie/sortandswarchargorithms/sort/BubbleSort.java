package com.algorithmen.theorie.sortandswarchargorithms.sort;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort {
    public void bubbleSort(int[] array) {
        // External loop for each pass through the array
        // array.length - 1 is used to avoid going outside the array.
        // Without -1, the inner loop will try to compare the element with the non-existent next element,
        // which will cause an error.
        for (int i = 0; i < array.length - 1; i++) {
            // At each pass, the largest element ‘pops up’ at the end of the array
            // and we know that the largest element is already at the end, so the next iteration array.length - i
            for (int j = 0; j < array.length - i - 1; j++) {
                //If the next element is larger than the current one, swap them in places
                if (array[j] > array[j + 1]) {
                    // Swap elements array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
