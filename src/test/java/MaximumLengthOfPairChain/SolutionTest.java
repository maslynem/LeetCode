package MaximumLengthOfPairChain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] pairs = new int[][]{{2, 3}, {1, 2}, {3, 4}};
        assertEquals(2, solution.findLongestChain(pairs));
    }

    @Test
    void test2() {
        int[][] pairs = new int[][]{{1, 2}, {7, 8}, {4, 5}};
        assertEquals(3, solution.findLongestChain(pairs));
    }

    @Test
    void test3() {
        int[][] pairs = new int[][]{{-6, 9}, {1, 6}, {8, 10}, {-1, 4}, {-6, -2}, {-9, 8}, {-5, 3}, {0, 3}};
        assertEquals(3, solution.findLongestChain(pairs));
    }

}