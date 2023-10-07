package MonotonicArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 3}, true),
                Arguments.of(new int[]{1, 3, 2}, false),
                Arguments.of(new int[]{6, 5, 4, 4}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums, boolean expected) {
        assertEquals(expected, solution.isMonotonic(nums));
    }

}