package com.algorithmen.stack;

import java.util.*;

/*The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.

The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:

If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
        Otherwise, they will leave it and go to the queue's end.
This continues until none of the queue students want to take the top sandwich and are thus unable to eat.

You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the ith sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the jth student in the initial queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.*/
public class NumberOfStudentsUnableToEatLunch {
    // Runtime beats 39%, memory 63%
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queueOfStudents = new LinkedList<>();
        Stack<Integer> stackOfSandwiches = new Stack<>();

        for (int i = 0; i < sandwiches.length; i++) {
            queueOfStudents.offer(students[i]);
            stackOfSandwiches.push(sandwiches[sandwiches.length - 1 - i]);
        }

        int lastServed = 0;
        while (!queueOfStudents.isEmpty() && lastServed < queueOfStudents.size()) {
            if (Objects.equals(queueOfStudents.peek(), stackOfSandwiches.peek())) {
                queueOfStudents.poll();
                stackOfSandwiches.pop();
                lastServed = 0;
            } else {
                queueOfStudents.offer(queueOfStudents.poll());
                lastServed++;
            }
        }
        return queueOfStudents.size();
    }
}
