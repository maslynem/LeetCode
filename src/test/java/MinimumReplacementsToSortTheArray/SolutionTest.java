package MinimumReplacementsToSortTheArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[]{3, 9, 3};
        assertEquals(2, solution.minimumReplacement(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertEquals(0, solution.minimumReplacement(nums));
    }

    @Test
    void test3() {
        int[] nums = new int[]{2,10,20,19,1};
        assertEquals(47, solution.minimumReplacement(nums));
    }

    @Test
    void test4() {
        int[] nums = new int[]{19,7,2,24,11,16,1,11,231};
        assertEquals(73, solution.minimumReplacement(nums));
    }
    @Test
    void test5() {
        int[] nums = new int[]{21,5};
        assertEquals(4, solution.minimumReplacement(nums));
    }


}