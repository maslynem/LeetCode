package BalancedBinaryTree;

class TreeNode {
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

/**
 * Given a binary tree, determine if it is height-balanced
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftMaxDepth = getMaxDepth(root.left, 1);
        int rightMaxDepth = getMaxDepth(root.right, 1);

        if (Math.abs(leftMaxDepth - rightMaxDepth) < 2) {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;

    }

    private int getMaxDepth(TreeNode node, int k) {
        if (node == null) return k;
        return Math.max(getMaxDepth(node.left, k + 1), getMaxDepth(node.right, k + 1));
    }
}