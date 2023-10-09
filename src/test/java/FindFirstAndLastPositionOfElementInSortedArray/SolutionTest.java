package FindFirstAndLastPositionOfElementInSortedArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1,1,1,1,1,1,1,1}, 1, new int[]{0,7}),
                Arguments.of(new int[]{5,7,7,8,8,10}, 8, new int[]{3,4}),
                Arguments.of(new int[]{5,7,7,8,10}, 8, new int[]{3,3}),
                Arguments.of(new int[]{5,7,7,8,8,10}, 6, new int[]{-1,-1}),
                Arguments.of(new int[]{}, 0, new int[]{-1,-1}),
                Arguments.of(new int[]{1}, 0, new int[]{-1,-1}),
            Arguments.of(new int[]{0}, 0, new int[]{0,0})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }


}