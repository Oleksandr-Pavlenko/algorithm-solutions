package com.algorithmen.string;

/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".*/
public class LongestCommonPrefix {
    //runtime beats 100%, memory 80%
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        // Taking the first item as a prefix
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            //remove the last prefix letter until both words have the same beginning
            while (strs[i].indexOf(prefix) != 0) {

                //remove the last letter
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
