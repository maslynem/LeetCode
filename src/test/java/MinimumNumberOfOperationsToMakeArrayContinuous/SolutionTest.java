package MinimumNumberOfOperationsToMakeArrayContinuous;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 5, 3}, 0),
                Arguments.of(new int[]{1, 2, 3, 5, 6}, 1),
                Arguments.of(new int[]{1, 10, 100, 1000}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums, int expected) {
        assertEquals(expected, solution.minOperations(nums));
    }
}