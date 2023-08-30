package TwoSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = solution.twoSum(nums, target);
        Arrays.sort(ints);
        assertArrayEquals(new int[]{0, 1}, ints);
    }
    @Test
    void test2() {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] ints = solution.twoSum(nums, target);
        Arrays.sort(ints);
        assertArrayEquals(new int[]{1,2},ints);
    }

    @Test
    void test3() {
        int[] nums = new int[]{3,3};
        int target = 6;
        int[] ints = solution.twoSum(nums, target);
        Arrays.sort(ints);
        assertArrayEquals(new int[]{0,1}, ints);
    }

}