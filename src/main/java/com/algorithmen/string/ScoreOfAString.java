package com.algorithmen.string;

/*You are given a string s.
The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
Return the score of s.*/

public class ScoreOfAString {
    public int scoreOfString(String s) {
        char[] character = s.toCharArray();
        int score = 0;
        for (int i = 0; i < character.length - 1; i++) {
            score += Math.abs(character[i] - character[i + 1]);
        }
        return score;
    }
}
