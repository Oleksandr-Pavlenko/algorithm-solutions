package com.algorithmen.stack;

import java.util.Stack;

/*You are given a string s consisting only of uppercase English letters.

You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.

Return the minimum possible length of the resulting string that you can obtain.

Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.*/
public class MinimumStringLengthAfterRemovingSubstrings {
    // Approach 2
    // Runtime beats 65%, memory 71%
    public static int minLength2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && ((s.charAt(i) == 'B' && stack.peek() == 'A') || (s.charAt(i) == 'D' && stack.peek() == 'C'))) {
                stack.pop();
            } else stack.push(s.charAt(i));
        }

        return stack.size();
    }

    // Approach 1
    // Runtime beats 7%, memory 6%
    public static int minLength1(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            if (s.contains("AB")) {
                s = s.replaceAll("AB", "");
            }
            if (s.contains("CD")) {
                s = s.replaceAll("CD", "");
            }
        }
        return s.length();
    }
}
