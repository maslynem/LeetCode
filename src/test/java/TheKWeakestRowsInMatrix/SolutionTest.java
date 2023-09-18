package TheKWeakestRowsInMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] mat = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int k = 3;
        int[] expected = {2, 0, 3};

        assertArrayEquals(expected, solution.kWeakestRows(mat, k));
    }

    @Test
    void test2() {
        int[][] mat = {{1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};
        int k = 2;
        int[] expected = {0, 2};
        assertArrayEquals(expected, solution.kWeakestRows(mat, k));
    }

}