package BinaryTreeInorderTraversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> expected = List.of(1,3,2);
        Assertions.assertEquals(expected, solution.inorderTraversal(root));
    }
    @Test
    void test2() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = List.of(1);
        Assertions.assertEquals(expected, solution.inorderTraversal(root));
    }
    @Test
    void test3() {
        TreeNode root = null;
        List<Integer> expected = Collections.emptyList();
        Assertions.assertEquals(expected, solution.inorderTraversal(root));
    }

}