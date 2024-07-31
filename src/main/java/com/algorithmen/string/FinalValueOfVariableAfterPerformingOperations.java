package com.algorithmen.string;

import java.util.Objects;

/*There is a programming language with only four operations and one variable X:

        ++X and X++ increments the value of the variable X by 1.
        --X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.*/

//runtime beats 79%
public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            if (Objects.equals(operation, "++X") || Objects.equals(operation, "X++")) {
                result++;
            } else if (Objects.equals(operation, "--X") || Objects.equals(operation, "X--")) {
                result--;
            }
        }
        return result;
    }
}
