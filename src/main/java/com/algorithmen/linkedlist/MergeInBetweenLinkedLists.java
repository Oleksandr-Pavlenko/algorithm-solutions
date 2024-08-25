package com.algorithmen.linkedlist;


/*You are given two linked lists: list1 and list2 of sizes n and m respectively.
Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
The blue edges and nodes in the following figure indicate the result:*/
public class MergeInBetweenLinkedLists {
    //runtime beats 100%, memory 88%
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode current = list1;

        for (int i = 0; i < a - 1; i++) {
            current = current.next;
        }

        ListNode prevA = current;

        for (int i = 0; i <= b - a + 1; i++) {
            current = current.next;
        }

        ListNode afterB = current;

        prevA.next = list2;

        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = afterB;

        return list1;
    }

    //runtime beats 33%, memory 78%
    public ListNode mergeInBetween1(ListNode list1, int a, int b, ListNode list2) {
        if (list1 == null || list2 == null) {
            return null;
        }

        ListNode head = new ListNode();
        ListNode current = head;

        int count = 0;

        while (count < a) {
            current.next = list1;
            current = current.next;
            list1 = list1.next;
            count++;
        }

        while (list2 != null) {
            current.next = list2;
            current = current.next;
            list2 = list2.next;
        }

        while (count <= b) {
            list1 = list1.next;
            count++;
        }

        while (list1 != null) {
            current.next = list1;
            current = current.next;
            list1 = list1.next;
        }

        return head.next;
    }

    /*Definition for singly-linked list*/
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
