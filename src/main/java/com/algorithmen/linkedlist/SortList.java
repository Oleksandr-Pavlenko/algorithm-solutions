package com.algorithmen.linkedlist;

import java.util.ArrayList;
import java.util.List;

/*Given the head of a linked list, return the list after sorting it in ascending order.*/
public class SortList {
    // Approach 2
    // Runtime beats 94%, memory 46%
    public ListNode sortList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode midNext = mid.next;
        mid.next = null;

        return merge(sortList(head), sortList(midNext));
    }

    ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        }

        if (l2 != null) {
            cur.next = l2;
        }

        return dummy.next;
    }

    // Approach 1
    // Runtime beats 13%, memory 90%
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        list.sort(Integer::compareTo);

        ListNode sortedList = new ListNode();
        ListNode current = sortedList;

        for (int i = 0; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return sortedList.next;
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
