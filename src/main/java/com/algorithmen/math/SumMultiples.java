package com.algorithmen.math;

/*Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

Return an integer denoting the sum of all numbers in the given range satisfying the constraint.*/
public class SumMultiples {
    //runtime beats 61%
    public int sumOfMultiples(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 || i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
