package SumOfLeftLeaves;

import java.util.ArrayDeque;
import java.util.Queue;

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
 * Given the root of a binary tree, return the sum of all left leaves.
 * <p>
 * A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                TreeNode leftChild = node.left;
                if (leftChild.left == null && leftChild.right == null) {
                    sum += leftChild.val;
                } else {
                    queue.add(leftChild);
                }
            }
            if (node.right != null)
                queue.add(node.right);
        }
        return sum;
    }
}