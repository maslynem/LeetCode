package BinaryTreePostorderTraversal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.EMPTY_LIST;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expected = List.of(3, 2, 1);
        assertEquals(expected, solution.postorderTraversal(root));
    }

    @Test
    void test2() {
        TreeNode node = new TreeNode(1);
        assertEquals(List.of(1), solution.postorderTraversal(node));
    }

    @Test
    void test3() {
        assertEquals(EMPTY_LIST, solution.postorderTraversal(null));
    }
}