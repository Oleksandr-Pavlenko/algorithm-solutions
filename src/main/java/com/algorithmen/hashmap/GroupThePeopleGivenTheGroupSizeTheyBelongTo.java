package com.algorithmen.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        if (groupSizes.length == 0) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
        }

        for (int size : map.keySet()) {
            List<Integer> group = map.get(size);
            for (int i = 0; i < group.size(); i += size) {
                result.add(new ArrayList<>(group.subList(i, i + size)));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        GroupThePeopleGivenTheGroupSizeTheyBelongTo g = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
        int [] groupSizes = {3,3,3,3,3,1,3};
        g.groupThePeople(groupSizes);
        System.out.println(g.groupThePeople(new int[]{1, 5, 4, 2, 2, 2, 2, 1}));
    }
}
