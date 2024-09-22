package com.algorithmen.hashmap;

import java.util.HashSet;
import java.util.Set;

/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.*/
public class CheckIfTheSentenceIsPangram {
    //runtime beats 35%. memory 82%
    public boolean checkIfPangram(String sentence) {
        final int lettersInAlphabet = 26;
        if (sentence == null || sentence.length() < lettersInAlphabet){
            return false;
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
