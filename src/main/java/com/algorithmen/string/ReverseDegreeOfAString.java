package com.algorithmen.string;


/*Given a string s, calculate its reverse degree.

The reverse degree is calculated as follows:

For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
Sum these products for all characters in the string.
Return the reverse degree of s.*/
public class ReverseDegreeOfAString {
    //time complexity 100%, memory 17%
    public int reverseDegree(String s) {
        int ans = 0;
        int numberOfLettersInAlphabet = 26;

        for (int i = 0; i < s.length(); i++) {
            ans += (i + 1) * (numberOfLettersInAlphabet - (s.charAt(i) - 'a'));
        }

        return ans;
    }
}
