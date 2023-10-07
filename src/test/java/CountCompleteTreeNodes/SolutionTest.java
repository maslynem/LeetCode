package CountCompleteTreeNodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        assertEquals(6, solution.countNodes(root));
    }

    @Test
    void test2() {
        assertEquals(0, solution.countNodes(null));
    }

}