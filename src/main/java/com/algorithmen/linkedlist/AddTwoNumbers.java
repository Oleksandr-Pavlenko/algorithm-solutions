package com.algorithmen.linkedlist;

import java.math.BigInteger;

/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/
public class AddTwoNumbers {
    // Approach 2
    // Runtime beats 100%, memory 32%
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(carry % 10);
            carry /= 10;
            current = current.next;
        }

        return dummy.next;
    }

    // Approach 1
    // Runtime beats 5%, memory 6%
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        BigInteger num1 = new BigInteger(getNumberFromList(l1).toString());
        BigInteger num2 = new BigInteger(getNumberFromList(l2).toString());
        BigInteger sum = num1.add(num2);

        String sumString = sum.toString();

        ListNode newNode = new ListNode(0);
        ListNode current = newNode;

        for (int i = sumString.length() - 1; i >= 0; i--) {
            current.next = new ListNode(sumString.charAt(i) - '0');
            current = current.next;
        }

        return newNode.next;

    }

    private BigInteger getNumberFromList(ListNode head) {
        StringBuilder result = new StringBuilder();
        while (head != null) {
            result.append(head.val);
            head = head.next;
        }
        return new BigInteger(result.reverse().toString());
    }


    /*Definition for singly-linked list.*/
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
