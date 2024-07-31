package com.algorithmen.math;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        if(s.isEmpty()) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            // Roman numeral rules, where smaller values before larger ones must be subtracted.
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i)); // If the current character is less than the next one, subtract its value
            } else {
                res += map.get(s.charAt(i)); // Otherwise, add its value
            }
        }
        System.out.println(res);
        return res;
    }
}
