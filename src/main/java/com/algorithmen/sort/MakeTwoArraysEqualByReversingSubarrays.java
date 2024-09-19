package com.algorithmen.sort;

import java.util.Arrays;

/*You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty subarray of arr and reverse it. You are allowed to make any number of steps.

Return true if you can make arr equal to target or false otherwise.*/
public class MakeTwoArraysEqualByReversingSubarrays {
    //runtime beats 80%, memory 16%
    public boolean canBeEqualSecondSolution(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] != target[i]){
                return false;
            }
        }

        return true;
    }

    //runtime beats 47%, memory 70%
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }

        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target, arr);
    }
}
