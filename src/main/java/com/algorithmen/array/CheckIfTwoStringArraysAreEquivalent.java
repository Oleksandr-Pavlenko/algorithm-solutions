package com.algorithmen.array;


/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.*/
public class CheckIfTwoStringArraysAreEquivalent {
    //runtime beats 66%, memory 70%
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1Builder = new StringBuilder();
        StringBuilder word2Builder = new StringBuilder();
        for (String s : word1) {
            word1Builder.append(s);
        }
        for (String s : word2) {
            word2Builder.append(s);
        }

        return word1Builder.toString().contentEquals(word2Builder);
    }
}
