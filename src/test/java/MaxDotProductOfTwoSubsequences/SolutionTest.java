package MaxDotProductOfTwoSubsequences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of(new int[]{-5,-1,-2}, new int[]{3,3,5,5}, -3),
            Arguments.of(new int[]{2,1,-2,5}, new int[]{3,0,-6}, 18),
            Arguments.of(new int[]{3,-2}, new int[]{2,-6,7}, 21),
            Arguments.of(new int[]{-1,-1}, new int[]{1,1}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums1, int[] nums2, int expected) {
        assertEquals(expected, solution.maxDotProduct(nums1, nums2));
    }

}