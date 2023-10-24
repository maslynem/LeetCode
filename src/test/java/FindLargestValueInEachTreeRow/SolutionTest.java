package FindLargestValueInEachTreeRow;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        List<Integer> expected = List.of(1,3,9);
        assertEquals(expected, solution.largestValues(root));
    }

}