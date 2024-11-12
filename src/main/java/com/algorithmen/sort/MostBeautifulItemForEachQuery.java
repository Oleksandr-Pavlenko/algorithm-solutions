package com.algorithmen.sort;

import java.util.*;

/*You are given a 2D integer array items where items[i] = [pricei, beautyi] denotes the price and beauty of an item respectively.

You are also given a 0-indexed integer array queries. For each queries[j], you want to determine the maximum beauty of
an item whose price is less than or equal to queries[j]. If no such item exists, then the answer to this query is 0.

Return an array answer of the same length as queries where answer[j] is the answer to the jth query.*/
public class MostBeautifulItemForEachQuery {
    // Approach 2
    // Runtime beats 7%, memory 67%
    public int[] maximumBeauty2(int[][] items, int[] queries) {
        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));

        int n = items.length;
        int[] maxBeautyPrefix = new int[n];
        maxBeautyPrefix[0] = items[0][1];

        // Add the largest element to the last place
        for (int i = 1; i < n; i++) {
            maxBeautyPrefix[i] = Math.max(maxBeautyPrefix[i - 1], items[i][1]);
        }

        int[][] queriesWithIndices = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queriesWithIndices[i][0] = queries[i];
            queriesWithIndices[i][1] = i;
        }
        Arrays.sort(queriesWithIndices, Comparator.comparingInt(a -> a[0]));

        int[] ans = new int[queries.length];

        int itemIndex = 0;
        for (int[] query : queriesWithIndices) {
            int queryPrice = query[0];
            int queryIndex = query[1];

            while (itemIndex < n && items[itemIndex][0] <= queryPrice) {
                itemIndex++;
            }

            if (itemIndex > 0) {
                ans[queryIndex] = maxBeautyPrefix[itemIndex - 1];
            } else {
                ans[queryIndex] = 0;
            }
        }

        return ans;
    }

    // Approach 1
    // Runtime beats 7%, memory 71%
    public int[] maximumBeauty1(int[][] items, int[] queries) {
        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));

        TreeMap<Integer, Integer> priceToMaxBeauty = new TreeMap<>();
        int currentMaxBeauty = 0;

        for (int[] item : items) {
            int price = item[0];
            int beauty = item[1];
            currentMaxBeauty = Math.max(currentMaxBeauty, beauty);
            priceToMaxBeauty.put(price, currentMaxBeauty);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            //Returns the greatest key less than or equal to the given key, or null if there is no such key
            Integer beauty = priceToMaxBeauty.floorKey(queries[i]);
            if (beauty != null) {
                ans[i] = priceToMaxBeauty.get(beauty);
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}
