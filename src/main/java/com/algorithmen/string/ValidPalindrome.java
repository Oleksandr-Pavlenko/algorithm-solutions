package com.algorithmen.string;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.*/
public class ValidPalindrome {
    //runtime beats 99%
    public boolean isPalindrome1(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip unnecessary characters on the left (. , " " - )
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip unnecessary characters on the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    //runtime beats 25%
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove all unnecessary characters (such as spaces and punctuation)
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
