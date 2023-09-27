package SameTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertTrue(solution.isSameTree(root, root));
    }
    @Test
    void test2() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        assertFalse(solution.isSameTree(root1, root2));
    }

}