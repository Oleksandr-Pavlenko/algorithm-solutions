package com.algorithmen.theorie.sortandswarchargorithms.search;

public class BinarySearch {
    public boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            }
            //смещаемся
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // mid - 1 as we don't need the middle index
            // and the right value becomes up to the middle value as the target is smaller than it
            if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return false;
    }
}
