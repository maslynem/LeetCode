package MinimumNumberOfTapsToOpenToWaterAGarden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] ranges = new int[]{3,4,1,1,0,0};
        int n = 5;
        assertEquals(1, solution.minTaps(n, ranges));
    }
    @Test
    void test2() {
        int[] ranges = new int[]{0,0,0,0};
        int n = 3;
        assertEquals(-1, solution.minTaps(n, ranges));
    }
    @Test
    void test3() {
        int[] ranges = new int[]{4,0,0,0,4,0,0,0,4};
        int n = 8;
        assertEquals(1, solution.minTaps(n, ranges));
    }

    @Test
    void test4() {
        int[] ranges = new int[]{0,5,0,3,3,3,1,4,0,4};
        int n = 9;
        assertEquals(2, solution.minTaps(n, ranges));
    }

}