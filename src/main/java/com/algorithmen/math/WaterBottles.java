package com.algorithmen.math;

/*There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.*/
public class WaterBottles {
    //runtime beats 100%, memory 70%
    //time complexity: O(logM N) N is the number of initial full bottles, and M is equal to numExchange
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int exchanges = emptyBottles / numExchange;
            emptyBottles -= exchanges * numExchange + exchanges;
            emptyBottles += exchanges;
            ans += exchanges;
        }

        return ans;
    }
}
