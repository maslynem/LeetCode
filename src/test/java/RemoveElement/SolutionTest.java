package RemoveElement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int[] result = new int[]{2, 2};
        Arrays.sort(result);
        assertEquals(2, solution.removeElement(nums, val));
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], nums[i]);
        }
    }

    @Test
    void test2() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] result = new int[]{0, 1, 3, 0, 4};
        assertEquals(5, solution.removeElement(nums, val));
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], nums[i]);
        }
    }

}