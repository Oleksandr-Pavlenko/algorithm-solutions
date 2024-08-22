package com.algorithmen.bitmanipulation;

/*The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.*/
public class NumberComplement {
    //runtime beats 100% , memory 91%
    public int findComplement1(int num) {
        if (num == 0) {
            return 1;
        }

        // Create a mask with the same 1 bits as num
        int mask = (Integer.highestOneBit(num) << 1) - 1;

        // Inverting num bits using a mask
        return num ^ mask;
    }

    //runtime beats 27%, memory 100%
    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }

        String binaryNum = Integer.toBinaryString(num);
        StringBuilder invertedBinaryNum = new StringBuilder();

        for (int i = 0; i < binaryNum.length(); i++) {
            if (binaryNum.charAt(i) == '1') {
                invertedBinaryNum.append('0');
            } else {
                invertedBinaryNum.append('1');
            }
        }

        return Integer.parseInt(String.valueOf(invertedBinaryNum), 2);
    }
}
