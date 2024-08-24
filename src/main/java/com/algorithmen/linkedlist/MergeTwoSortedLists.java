package com.algorithmen.linkedlist;

/*You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.*/
public class MergeTwoSortedLists {
    //runtime beats 100% , memory 88%
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }

        // Add the remaining elements
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }


    /*Definition for singly-linked list.*/
    public static class ListNode {
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

    public static void main(String[] args) {
        int[] values1 = {1, 2, 4};
        ListNode head1 = new ListNode(values1[0]);
        ListNode current1 = head1;
        for (int i = 1; i < values1.length; i++) {
            current1.next = new ListNode(values1[i]);
            current1 = current1.next;
        }

        int[] values2 = {1, 3, 4};
        ListNode head2 = new ListNode(values2[0]);
        ListNode current2 = head2;
        for (int i = 1; i < values2.length; i++) {
            current2.next = new ListNode(values2[i]);
            current2 = current2.next;
        }

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists(head1, head2);
    }
}
