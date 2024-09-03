package com.algorithmen.string;

/*You are given a string s consisting of lowercase English letters, and an integer k.

First, convert s into an integer by replacing each letter with its position in the alphabet
(i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits.
Repeat the transform operation k times in total.

For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:

Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8
Return the resulting integer after performing the operations described above.*/
public class SumOfDigitsOfStringAfterConvert {
    //runtime beats 89 %, memory 42 %
    public int getLucky(String s, int k) {
        if (s.isEmpty() || k == 0) {
            return 0;
        }

        int sumOfDigitsOfString = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a' + 1;

            // break the value into numbers and sum them up
            while (value > 0) {
                sumOfDigitsOfString += value % 10;
                value /= 10;
            }
        }

        k--;
        while (k > 0) {
            int newSum = 0;
            while (sumOfDigitsOfString > 0) {
                newSum += sumOfDigitsOfString % 10;  // Get last digit
                sumOfDigitsOfString /= 10;           // Remove last digit
            }
            sumOfDigitsOfString = newSum;
            k--;
        }

        return sumOfDigitsOfString;
    }

    public static void main(String[] args) {
        SumOfDigitsOfStringAfterConvert s = new SumOfDigitsOfStringAfterConvert();
        s.getLucky("iiii", 2);
    }
}
