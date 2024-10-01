package com.algorithmen.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
        'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.*/
public class BaseballGame {
    // Approach 2
    // Runtime beats 94%, memory 83%
    public int calPoints2(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                }
                case "C" -> stack.pop();
                case "D" -> stack.push(stack.peek() * 2);
                default -> stack.push(Integer.parseInt(operation));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    // Approach 1
    // Runtime beats 12%, memory 71%
    public int calPoints1(String[] operations) {
        List<Integer> ans = new ArrayList<>();

        for (String operation : operations) {
            switch (operation) {
                case "+" -> ans.add(ans.getLast() + ans.get(ans.size() - 2));
                case "D" -> ans.add(ans.getLast() * 2);
                case "C" -> ans.remove(ans.getLast());
                default -> ans.add(Integer.parseInt(operation));
            }
        }
        return ans.stream().mapToInt(i -> i).sum();
    }
}
