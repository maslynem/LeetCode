package InvertBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SolutionTest {

    private static final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode expected = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        TreeNode result = solution.invertTree(root);
        assertNotNull(result);
        assertNotNull(result.left);
        assertNotNull(result.right);
        assertEquals(expected.val, result.val);
        assertEquals(expected.left.val, result.left.val);
        assertEquals(expected.right.val, result.right.val);

    }
}