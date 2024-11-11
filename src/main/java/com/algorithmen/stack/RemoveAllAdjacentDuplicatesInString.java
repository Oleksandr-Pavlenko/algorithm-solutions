package com.algorithmen.stack;

import java.util.Stack;

/*You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.*/
public class RemoveAllAdjacentDuplicatesInString {
    // Runtime beats 44%, memory 75%
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }
}
