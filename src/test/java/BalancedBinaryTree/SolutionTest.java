package BalancedBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertTrue(solution.isBalanced(root));

    }
    @Test
    void test2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        root.left = new TreeNode(2, null, new TreeNode(3));
        root.left.left = new TreeNode(3, new TreeNode(4), new TreeNode(4));
        assertFalse(solution.isBalanced(root));
    }
    @Test
    void test3() {
        assertTrue(solution.isBalanced(null));
    }
    @Test
    void test4() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        root.left.left = new TreeNode(3, new TreeNode(4), null);
        root.right.right = new TreeNode(3, null, new TreeNode(4));
        assertFalse(solution.isBalanced(root));
    }

}