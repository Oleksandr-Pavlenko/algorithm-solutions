package com.algorithmen.tree;

/*Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].*/
public class RangeSumOfBST {
    //runtime beats 100%, memory 63%
    //time: O(N), space: O(N)
    private int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);

        return sum;
    }

    private void dfs(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }
        if (low <= root.val && root.val <= high) {
            sum += root.val;
        }

        if (low < root.val){
            dfs(root.left, low, high);
        }

        if (high > root.val){
            dfs(root.right, low, high);
        }
    }


    /*Definition for a binary tree node.*/

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
