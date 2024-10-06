package com.algorithmen.string;

/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.*/
public class LengthOfLastWord {
    // Approach 2
    // Runtime beats 100%, memory 99,5 %
    public int lengthOfLastWord2(String s) {
        String str = s.trim();
        int ans = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            ans++;
        }
        return ans;
    }

    // Approach 1
    // Runtime beats 33%, memory 50%
    public int lengthOfLastWord1(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
