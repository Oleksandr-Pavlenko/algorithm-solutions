package com.algorithmen.string;


/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s and an integer k words. You want to truncate s such that it contains only the first k words.
Return s after truncating it.*/
public class TruncateSentence {
    //runtime beats 75 %, memory 86%
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        int count = k;

        for (String word : words) {
            if (count > 0) {
                result.append(word);
                count--;
                if (count > 0) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }
}
