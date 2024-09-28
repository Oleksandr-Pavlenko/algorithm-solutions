package com.algorithmen.sort;

import java.util.HashSet;
import java.util.Set;

/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.*/
public class ReverseVowelsOfAString {
    //
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int right = chars.length - 1;
        int left = 0;

        while (left < right) {
            while (left < right && !isVowels(chars[left])) {
                left++;
            }
            while (left < right && !isVowels(chars[right])) {
                right--;
            }
            if (left >= right) {
                break;
            }
            swapVowels(chars, left, right);
            left++;
            right--;
        }
        return new String(chars);
    }

    public Boolean isVowels(char s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        return vowels.contains(s);
    }

    public void swapVowels(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
