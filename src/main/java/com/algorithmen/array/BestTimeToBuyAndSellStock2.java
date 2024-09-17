package com.algorithmen.array;

/*You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.*/
public class BestTimeToBuyAndSellStock2 {
    //runtime beats 91%, memory 94%
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int totalProfit = 0;
        int valley = prices[0];
        int peak = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < peak) {
                totalProfit += peak - valley;
                valley = prices[i];
            }
            peak = prices[i];
        }

        totalProfit += peak - valley;

        return totalProfit;
    }
}
