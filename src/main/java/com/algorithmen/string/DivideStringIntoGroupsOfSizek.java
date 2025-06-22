package com.algorithmen.string;

/*
A string s can be partitioned into groups of size k using the following procedure:

The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. Each element can be a part of exactly one group.
For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.
Note that the partition is done so that after removing the fill character from the last group (if it exists) and concatenating all the groups in order, the resultant string should be s.

Given the string s, the size of each group k and the character fill, return a string array denoting the composition of every group s has been divided into, using the above procedure.

*/

//time complexity 94%, memory 26%
public class DivideStringIntoGroupsOfSizek {
    public String[] divideString(String s, int k, char fill) {
        int length = (s.length() + k - 1) / k;
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            int start = i * k;
            int end = Math.min(start + k, s.length());
            StringBuilder group = new StringBuilder(s.substring(start, end));
            while (group.length() < k) {
                group.append(fill);
            }

            result[i] = group.toString();
        }

        return result;
    }
}
