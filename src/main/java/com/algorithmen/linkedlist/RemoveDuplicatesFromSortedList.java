package com.algorithmen.linkedlist;

/*Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.*/
public class RemoveDuplicatesFromSortedList {
    // Runtime beats 100%, memory 31%
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode next = head.next;

        while (next != null) {
            if (current.val == next.val) {
                current.next = next.next;

            } else {
                current = next;
            }
            next = next.next;
        }
        return head;
    }


    /*    Definition for singly-
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
