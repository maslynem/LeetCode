package PathSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(5, new TreeNode(4), new TreeNode(8));
        root.left.left = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4, null, new TreeNode(1));
        assertTrue(solution.hasPathSum(root, 22));
    }
    @Test
    void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertFalse(solution.hasPathSum(root, 5));
    }
    @Test
    void test3() {
        assertFalse(solution.hasPathSum(null, 0));
    }

}