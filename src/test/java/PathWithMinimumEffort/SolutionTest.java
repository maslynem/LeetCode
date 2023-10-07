package PathWithMinimumEffort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[][]{{3}}, 0),
                Arguments.of(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}}, 2),
                Arguments.of(new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}}, 1),
                Arguments.of(new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[][] heights, int expected) {
        assertEquals(expected, solution.minimumEffortPath(heights));
    }
}