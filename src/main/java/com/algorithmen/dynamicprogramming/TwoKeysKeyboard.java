package com.algorithmen.dynamicprogramming;

/*There is only one character 'A' on the screen of a notepad. You can perform one of two operations on this notepad for each step:

Copy All: You can copy all the characters present on the screen (a partial copy is not allowed).
Paste: You can paste the characters which are copied last time.
Given an integer n, return the minimum number of operations to get the character 'A' exactly n times on the screen.*/
public class TwoKeysKeyboard {
    //runtime beats 100%
    public int minSteps(int n) {
        int numberOfOperations = 0;

        if (n <= 1) {
            return numberOfOperations;
        }

        // We are looking for the numbers by which n can be divided without remainder.
        // If we find such a number i, it means that we can get n by performing i operations.
        // We add i to the number of operations and divide n by i to continue this process until n becomes 1.
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                numberOfOperations += i;
                n /= i;
            }
        }

        return numberOfOperations;
    }
}
