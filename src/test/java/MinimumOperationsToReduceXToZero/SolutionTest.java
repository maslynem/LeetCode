package MinimumOperationsToReduceXToZero;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 4, 2, 3}, 5, 2),
                Arguments.of(new int[]{5, 6, 7, 8, 9}, 4, -1),
                Arguments.of(new int[]{3, 2, 20, 1, 1, 3}, 10, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums, int x, int expected) {
        assertEquals(expected, solution.minOperations(nums, x));
    }
}