package com.algorithmen.linkedlist;

import java.util.HashSet;
import java.util.Set;

/*You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list
after removing all nodes from the linked list that have a value that exists in nums.*/
public class DeleteNodesFromLinkedListPresentInArray {
    //runtime beats 87%, memory 52%
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (nums == null || nums.length == 0) {
            return head;
        }

        Set<Integer> valuesToRemove = new HashSet<>();
        for (int num : nums) {
            valuesToRemove.add(num);
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (head != null) {
            if (!valuesToRemove.contains(head.val)) {
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }
        current.next = null;

        return dummy.next;
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
