package com.algorithmen.string;

/*Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
then reverse the first k characters and leave the other as original.*/
public class ReverseString2 {
    // Approach 2
    // Runtime beats 75%, memory 95%
    public String reverseStr2(String s, int k) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, chars.length - 1);

            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    // Approach 1
    // Runtime beats 10%, memory 62%
    public String reverseStr1(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int numOfIteration = (s.length() + 2 * k - 1) / (2 * k);

        for (int i = 0; i < numOfIteration; i++) {
            int start = i * 2 * k;
            int end = Math.min(start + k, s.length());

            for (int j = end - 1; j >= start; j--) {
                sb.append(s.charAt(j));
            }

            for (int j = end; j < Math.min(start + 2 * k, s.length()); j++) {
                sb.append(s.charAt(j));
            }
        }

        return sb.toString();
    }
}
