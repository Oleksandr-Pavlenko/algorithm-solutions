package com.algorithmen.string;

/*Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.*/
public class MaximumNestingDepthOfTheParentheses {
    //runtime beats 100%, memory 48%
    public static int maxDepth(String s) {
        int nestingDepth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                nestingDepth++;
                maxDepth = Math.max(maxDepth, nestingDepth);
            } else if (s.charAt(i) == ')') {
                nestingDepth--;
            }
        }
        return maxDepth;
    }
}
