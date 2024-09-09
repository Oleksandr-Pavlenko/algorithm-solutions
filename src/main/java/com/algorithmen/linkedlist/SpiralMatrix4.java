package com.algorithmen.linkedlist;

/*You are given two integers m and n, which represent the dimensions of a matrix.

You are also given the head of a linked list of integers.

Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise),
starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.

Return the generated matrix.*/
public class SpiralMatrix4 {
    //runtime beats 88%, memory 50%
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];

        //Initialize the matrix with values -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                if (head != null) {
                    matrix[top][i] = head.val;
                    head = head.next;
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                if (head != null) {
                    matrix[i][right] = head.val;
                    head = head.next;
                }
            }
            right--;

            for (int i = right; i >= left; i--) {
                if (head != null) {
                    matrix[bottom][i] = head.val;
                    head = head.next;
                }
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                if (head != null) {
                    matrix[i][left] = head.val;
                    head = head.next;
                }
            }
            left++;
        }

        return matrix;
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
        int[] values = {3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0};
        ListNode head = new ListNode();
        ListNode current = head;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        SpiralMatrix4 spiralMatrix4 = new SpiralMatrix4();
        spiralMatrix4.spiralMatrix(3, 5, head.next);
    }
}
