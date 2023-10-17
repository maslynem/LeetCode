package ValidateBinaryTreeNodes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/**
 * You have n binary tree nodes numbered from 0 to n - 1 where node i has two children leftChild[i] and rightChild[i], return true if and only if all the given nodes form exactly one valid binary tree.
 * <p>
 * If node i has no left child then leftChild[i] will equal -1, similarly for the right child.
 * <p>
 * Note that the nodes have no values and that we only use the node numbers in this problem.
 */
class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int root = findRoot(n, leftChild, rightChild);
        if (root == -1) {
            return false;
        }
        Set<Integer> seen = new HashSet<>();
        seen.add(root);
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int node = stack.poll();

            int[] children = {leftChild[node], rightChild[node]};

            for (int child : children) {
                if (child != -1) {
                    if (seen.contains(child)) {
                        return false;
                    }
                    stack.push(child);
                    seen.add(child);
                }
            }
        }
        return seen.size() == n;
    }

    public int findRoot(int n, int[] left, int[] right) {
        Set<Integer> children = new HashSet<>();
        for (int node : left) {
            children.add(node);
        }

        for (int node : right) {
            children.add(node);
        }

        for (int i = 0; i < n; i++) {
            if (!children.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}