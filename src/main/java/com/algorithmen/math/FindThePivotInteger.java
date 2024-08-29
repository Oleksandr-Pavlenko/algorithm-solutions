package com.algorithmen.math;

/*Given a positive integer n, find the pivot integer x such that:
The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most
one pivot index for the given input.*/
public class FindThePivotInteger {
    public int pivotIntegerSecondSolution(int n) {
        //runtime beats 100%, memory 51%
        double pivot = Math.sqrt((n + 1) * n / 2);

        return (pivot % 1 != 0) ? -1 : (int) pivot;
    }

    //runtime beat 7%, memory 17%
    public int pivotInteger(int n) {
        int sumOfNumbersBetweenN = (n + 1) * n / 2;
        int pivotOfSum = (int) Math.sqrt(sumOfNumbersBetweenN);

        return pivotOfSum * pivotOfSum == sumOfNumbersBetweenN ? pivotOfSum : -1;
    }
}