package com.algorithmen.math;

/*You are given an integer num. You can swap two digits at most once to get the maximum valued number.

Return the maximum valued number you can get.*/
public class MaximumSwap {
    // Runtime beats 100%, memory 30%
    public int maximumSwap(int num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            int maxValueIndex = i;

            for (int j = i + 1; j < str.length(); j++) {
                if (chars[j] >= chars[maxValueIndex]) {
                    maxValueIndex = j;
                }
            }

            if (chars[maxValueIndex] > chars[i]) {
                char temp = chars[i];
                chars[i] = chars[maxValueIndex];
                chars[maxValueIndex] = temp;
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }
}
