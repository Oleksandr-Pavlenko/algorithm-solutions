package com.algorithmen.string;

/*Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.*/
public class RotateString {
    // Runtime beats 100%, memory 94%
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate the string with itself to get all possible cyclic shifts.
        // If the goal string is a cyclic shift of s, it will be a substring of the doubled string.
        String doubledS = s + s;
        return doubledS.contains(goal);
    }
}
