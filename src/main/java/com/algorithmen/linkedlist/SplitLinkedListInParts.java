package com.algorithmen.linkedlist;

/*Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
The length of each part should be as equal as possible: no two parts should have a size differing by more than one.
This may lead to some parts being null.
The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have
a size greater than or equal to parts occurring later.
Return an array of the k parts.*/
public class SplitLinkedListInParts {
    //runtime beats 100%, memory 12%
    public ListNode[] splitListToParts(ListNode head, int k) {
        if (head == null) {
            return new ListNode[k];
        }

        int length = 0;
        ListNode[] parts = new ListNode[k];
        ListNode current = head;

        while (current != null) {
            current = current.next;
            length++;
        }

        int numberOfNodes = length / k;
        int remainderOfNumberOfNodes = length % k;

        //Back to the head of the list
        current = head;

        for (int i = 0; i < k; i++) {
            ListNode partHead = current;
            ListNode partCurrent = partHead;

            int currentPartSize = numberOfNodes;

            // Checking whether one element needs to be added to the current part
            if (i < remainderOfNumberOfNodes) {
                currentPartSize++;
            }

            for (int j = 1; j < currentPartSize; j++) {
                if (partCurrent != null) {
                    partCurrent = partCurrent.next;
                }
            }

            if (partCurrent != null) {
                ListNode nextPart = partCurrent.next;
                partCurrent.next = null;
                current = nextPart;
            }

            parts[i] = partHead;
        }

        return parts;
    }


    //Definition for singly-linked list
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
