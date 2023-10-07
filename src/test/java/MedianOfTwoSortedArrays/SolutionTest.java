package MedianOfTwoSortedArrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final double DELTA = 1e-7;
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2),
                Arguments.of(new int[]{1, 3}, new int[]{2, 7}, 2.5),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums1, int[] nums2, double expected) {
        Assertions.assertEquals(expected, solution.findMedianSortedArrays(nums1, nums2), DELTA);
    }
}