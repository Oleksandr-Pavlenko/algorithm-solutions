package com.algorithmen.contest.virtualcontest405;

public class FindTheEncryptedString {
    public String getEncryptedString(String s, int k) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int newPosition = (i + k) % s.length();
            result[i] = s.charAt(newPosition);
        }

        return new String(result);
    }
}
