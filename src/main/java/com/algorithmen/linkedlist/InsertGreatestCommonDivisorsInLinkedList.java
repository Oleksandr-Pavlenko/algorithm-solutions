package com.algorithmen.linkedlist;

/*Given the head of a linked list head, in which each node contains an integer value.
Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
Return the linked list after insertion.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.*/
public class InsertGreatestCommonDivisorsInLinkedList {
    //runtime beats 72%, memory 13%
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (head != null && head.next != null) {
            current.next = head;
            head = head.next;
            current = current.next;
            current.next = new ListNode(gcd(current.val, current.next.val));
            current = current.next;

        }

        current.next = head;

        return dummy.next;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /*Definition for singly linked list.*/
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

    public void main(String[] args) {
        int[] values = {18, 6, 10, 3};
        ListNode head = new ListNode();
        ListNode current = head;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        InsertGreatestCommonDivisorsInLinkedList insertGreatestCommonDivisorsInLinkedList = new InsertGreatestCommonDivisorsInLinkedList();
        insertGreatestCommonDivisorsInLinkedList.insertGreatestCommonDivisors(head.next);
    }
}
