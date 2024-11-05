package com.algorithmen.string;

/*Given a string word, compress it using the following algorithm:

Begin with an empty string comp. While word is not empty, use the following operation:
Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
Append the length of the prefix followed by c to comp.
Return the string comp.*/
public class StringCompression3 {
    // Runtime beats 46, memory 79%
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= word.length(); i++) {
            if (i == word.length() || word.charAt(i) != word.charAt(i - 1)) {
                while (count > 9) {
                    result.append(9).append(word.charAt(i - 1));
                    count -= 9;
                }
                result.append(count).append(word.charAt(i - 1));

                count = 1;
            } else {
                count++;
            }
        }

        return result.toString();
    }
}
