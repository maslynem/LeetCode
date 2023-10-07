package BinaryTreePreorderTraversal;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, solution.preorderTraversal(root));
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = List.of(1);
        assertEquals(expected, solution.preorderTraversal(root));
    }

    @Test
    void test2() {
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, solution.preorderTraversal(null));
    }

}