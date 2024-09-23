package com.algorithmen.string;

/*You are given a string s and an integer array indices of the same length. The string s will be shuffled such
that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.*/
public class ShuffleString {
    //runtime beats 100%, memory 20%
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}
