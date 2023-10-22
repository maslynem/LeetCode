package IslandPerimeter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}, 16),
                Arguments.of(new int[][]{{1}}, 4),
                Arguments.of(new int[][]{{1, 0}}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[][] grid, int expected) {
        assertEquals(expected, solution.islandPerimeter(grid));
    }
}