package com.algorithmen.hashmap;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//runtime beats 61%
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<Character>();
        int jewelCount = 0;
        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }

        for (char c : stones.toCharArray()) {
            if (jewelSet.contains(c)) {
                jewelCount++;
            }
        }

        return jewelCount;
    }

    //runtime beats 15%
    public int numJewelsInStones1(String jewels, String stones) {
        Set<Character> jewelSet = jewels.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());

        int jewelCount = (int) stones.chars()
                .filter(c -> jewelSet.contains((char) c))
                .count();

        return jewelCount;
    }

}
