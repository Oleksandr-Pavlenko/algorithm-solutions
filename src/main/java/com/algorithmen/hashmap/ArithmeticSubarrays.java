package com.algorithmen.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every
two consecutive elements is the same. More formally, a sequence s is arithmetic if and only if s[i+1] - s[i] == s[1] - s[0] for all valid i.

        For example, these are arithmetic sequences:

        1, 3, 5, 7, 9
        7, 7, 7, 7
        3, -1, -5, -9
The following sequence is not arithmetic:

        1, 1, 2, 5, 7
You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range queries,
where the ith query is the range [l[i], r[i]]. All the arrays are 0-indexed.

Return a list of boolean elements answer, where answer[i] is true if the subarray nums[l[i]], nums[l[i]+1], ... ,
nums[r[i]] can be rearranged to form an arithmetic sequence, and false otherwise.*/
public class ArithmeticSubarrays {
    //runtime beats 50%
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        if (l.length != r.length) {
            return null;
        }

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int start = l[i];
            int end = r[i];
            int[] subarray = Arrays.copyOfRange(nums, start, end + 1);
            Arrays.sort(subarray);

            boolean isArithmetic = true;

            for (int j = 0; j < subarray.length - 1; j++) {
                if (subarray[j + 1] - subarray[j] != subarray[1] - subarray[0]) {
                    isArithmetic = false;
                    break;
                }
            }
            result.add(isArithmetic);

        }
        return result;
    }
}
