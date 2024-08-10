package com.algorithmen.linkedlist;

public class MiddleOfTheLinkedList {

/*    Given the head of a singly linked list, return the middle node of the linked list.

    If there are two middle nodes, return the second middle node.*/

    //runtime beats 100%
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        int middle = length / 2;

        current = head;

        for (int i = 0; i < middle; i++) {
            current = current.next;
        }

        return current;
    }


    /*Definition for singly-
    linked list.*/
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
