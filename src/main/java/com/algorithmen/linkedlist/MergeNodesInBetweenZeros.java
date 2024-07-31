package com.algorithmen.linkedlist;

/*You are given the head of a linked list, which contains a series of integers separated by 0's.
The beginning and end of the linked list will have Node.val == 0.
For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is
the sum of all the merged nodes. The modified list should not contain any 0's.

Return the head of the modified linked list.*/
public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int sum = 0;

        // Skip the first null node
        head = head.next;

        while (head != null) {
            if (head.val == 0) {
                // If we encounter zero and the sum is not equal to zero, create a new node with the sum
                if (sum != 0) {
                    current.next = new ListNode(sum, current.next); // Create a new node and link it
                    sum = 0;
                }
            } else {
                sum += head.val;
            }
            head = head.next;
        }

        return dummy.next;
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

    public void main(String[] args) {
        int[] values = {0, 3, 1, 0, 4, 5, 2, 0};
        ListNode head = new ListNode();
        ListNode current = head;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        MergeNodesInBetweenZeros mergeNodesInBetweenZeros = new MergeNodesInBetweenZeros();
        mergeNodesInBetweenZeros.mergeNodes(head);
    }
}
