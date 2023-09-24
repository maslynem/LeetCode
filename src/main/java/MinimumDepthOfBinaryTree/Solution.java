package MinimumDepthOfBinaryTree;

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
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        int currentDepth = 0;
        while (!nodes.isEmpty()) {
            currentDepth++;
            int nodesInRow = nodes.size();
            for (int i = 0; i < nodesInRow; i++) {
                TreeNode node = nodes.poll();
                if (node.left == null && node.right == null) {
                    return currentDepth;
                }
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null){
                    nodes.add(node.right);
                }
            }
        }
        return currentDepth;
    }
}