package IntersectionOfTwoArrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of(new int[]{4,7,9,7,6,7}, new int[]{5,0,0,6,1,6,2,2,4}, new int[]{4,6}),
            Arguments.of(new int[]{1,2,2,1}, new int[]{2,2}, new int[]{2})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums1, int[] nums2, int[] expected) {
        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }
}