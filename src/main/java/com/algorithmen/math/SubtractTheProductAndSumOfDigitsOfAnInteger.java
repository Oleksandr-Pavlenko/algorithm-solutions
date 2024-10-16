package com.algorithmen.math;

//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    //Runtime beats 100%, memory 99%
    public int subtractProductAndSum(int n) {
        int sumOfProduct = 0;
        int sumOfDigits = 1;

        String numberString = Integer.toString(n);

        for (int i = 0; i < numberString.length(); i++) {
            sumOfProduct += Integer.parseInt(numberString.charAt(i) + "");
            sumOfDigits *= Integer.parseInt(numberString.charAt(i) + "");
        }

        return sumOfDigits- sumOfProduct;
    }
}
