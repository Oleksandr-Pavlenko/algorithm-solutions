package com.algorithmen.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        //the first element of each row is always 1
        result.add(1);

        if (rowIndex == 0) {
            return result;
        }

        for (int i = 1; i <= rowIndex; i++) {
            // The last element of each row is always 1
            result.add(1);

            // Update the middle elements of the string (from left to right)
            //start with the penultimate element, as the last element is always equal to 1
            //the cycle goes up to the first element j > 0, but does not include it, because the first element is always 1.
            for (int j = result.size() - 2; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle2 t = new PascalsTriangle2();
        List<Integer> result = t.getRow(3);
    }
}
