package com.algorithmen.math;


public class Palindrome {
    public boolean isPalindrome(int x) {
        //negative numbers cannot be polydromes
        if (x < 0) {
            return false;
        }

        String original = String.valueOf(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
