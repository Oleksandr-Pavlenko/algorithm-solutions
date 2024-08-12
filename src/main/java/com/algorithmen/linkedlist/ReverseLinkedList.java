package com.algorithmen.linkedlist;

import java.util.ArrayList;
import java.util.List;

/*Given the head of a singly linked list, reverse the list, and return the reversed list.*/
public class ReverseLinkedList {
    //runtime beat 100%
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode newList = null;
        ListNode current = head; //это первый узел

        while (current != null) {
            ListNode nextNode = current.next; // Save the next node (We are currently at node 2)
            current.next = newList; // Reverse the link from the right element to the left one
            newList = current; // Move newList to the current node
            current = nextNode; // Move to the next node
        }

        return newList;
    }

    //runtime beat 6%
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode current = head;

        List<Integer> list = new ArrayList<>();
        while (current != null){
            list.add(current.val);
            current = current.next;
        }

        current = head;

        for (int i = list.size() - 1; i >= 0; i--){
            current.val = list.get(i);
            current = current.next;
        }

        return head;
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

    public void main(String[] args) {
        int[] values = {3, 1, 8, 4, 5, 2};
        ListNode head = new ListNode();
        ListNode current = head;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reversed = reverseLinkedList.reverseList1(head);
    }
}
