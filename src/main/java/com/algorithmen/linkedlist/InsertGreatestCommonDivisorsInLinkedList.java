/*
package com.leetcode.algorithmen.linkedlist;

public class InsertGreatestCommonDivisorsInLinkedList {

*/
/*    Given the head of a linked list head, in which each node contains an integer value.
    Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
    Return the linked list after insertion.
    The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.*//*


    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(head.val);
        ListNode next = dummy.next;

        while (head != null) {
            while (next.val != 0) {
                int temp = next.val;

            }


        }
    }

    */
/*Definition for singly-
    linked list.*//*

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
        ListNode head = new ListNode(); // Начальный узел
        ListNode current = head;  // Указатель current изначально указывает на head
        for (int value : values) {
            current.next = new ListNode(value); // Создаем новый узел и связываем его
            current = current.next; // Перемещаем current на новый узел
        }

        InsertGreatestCommonDivisorsInLinkedList insertGreatestCommonDivisorsInLinkedList = new InsertGreatestCommonDivisorsInLinkedList();
        insertGreatestCommonDivisorsInLinkedList.insertGreatestCommonDivisors(head);
    }
}
*/
