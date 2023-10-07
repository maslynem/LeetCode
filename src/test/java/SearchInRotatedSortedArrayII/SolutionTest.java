package SearchInRotatedSortedArrayII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, 1, true),
                Arguments.of(new int[]{1, 0, 1, 1, 1}, 0, true),
                Arguments.of(new int[]{2, 5, 6, 0, 0, 1, 2}, 0, true),
                Arguments.of(new int[]{2, 5, 6, 0, 0, 1, 2}, 3, false),
                Arguments.of(new int[]{2, 2, 2, 3, 2, 2, 2}, 3, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void test(int[] nums, int target, boolean expected) {
        assertEquals(expected, solution.search(nums, target));
    }
}