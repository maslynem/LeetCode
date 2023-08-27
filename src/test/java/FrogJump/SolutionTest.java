package FrogJump;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int[] stones = new int[]{0,1,3,5,6,8,12,17};
        assertTrue(solution.canCross(stones));
    }

    @Test
    void test2() {
        int[] stones = new int[]{0,1,2,3,4,8,9,11};
        assertFalse(solution.canCross(stones));
    }

}