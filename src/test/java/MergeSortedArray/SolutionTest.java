package MergeSortedArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3, new int[]{1,2,2,3,5,6}),
                Arguments.of(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "argumentsStream")
    void test(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

}