package com.algorithmen.string;

/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.*/
public class MaximumNumberOfWordsFoundInSentences {

    //runtime 85%
    public int mostWordsFound(String[] sentences) {
        if (sentences.length == 0) {
            return 0;
        }

        int max = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            max = Math.max(max, words.length);
        }
        return max;
    }

    //runtime beat 25%
    public int mostWordsFound1(String[] sentences) {
        if (sentences.length == 0) {
            return 0;
        }

        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            int current = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    current++;
                }
            }
            max = Math.max(max, current + 1);

        }
        return max;
    }
}
