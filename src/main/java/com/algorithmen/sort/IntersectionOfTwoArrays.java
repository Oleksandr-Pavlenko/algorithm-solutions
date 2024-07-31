package com.algorithmen.sort;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i) {
                    if (!set.contains(k) && !set.contains(i)) {
                        set.add(k);
                    }
                }
            }
        }
        return set.stream().mapToInt(i -> i).toArray();
    }

/*    public int[] intersection2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1= 0;
        int p2 = 0;
        Set<Integer> set = new HashSet<>();

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                set.add(nums1[p1]);
            }
            if (nums1[p1] < nums2[p2]) {

            }

        } {
            set.add(nums1[nums1.length - 1]);
            nums1[nums1.length - 1] = nums2[nums2.length - 1];
        }
    }*/
}
