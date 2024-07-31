package com.algorithmen.array;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0) {
            return 0;
        }

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {3, 2, 1}
        };
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        richestCustomerWealth.maximumWealth(input);
    }
}
