package com.algorithmen.stack;

/*A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.*/
public class MinimumAddToMakeParenthesesValid {
    // Runtime beats 100%, memory 50%
    public static int minAddToMakeValid(String s) {
        int openBrackets = 0;
        int minAddsRequired = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openBrackets++;
            } else {
                if (openBrackets > 0) {
                    openBrackets--;
                } else {
                    minAddsRequired++;
                }
            }
        }
        return minAddsRequired + openBrackets;
    }
}
