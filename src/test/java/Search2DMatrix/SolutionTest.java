package Search2DMatrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3, true),
                Arguments.of(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13, false),
                Arguments.of(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 11, true),
                Arguments.of(new int[][]{{1, 3}}, 3, true),
                Arguments.of(new int[][]{{1}}, 1, true),
                Arguments.of(new int[][]{{1}}, 3, false),
                Arguments.of(new int[][]{{1}, {3}}, 3, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void test(int[][] matrix, int target, boolean expected) {
        assertEquals(expected, solution.searchMatrix(matrix, target));
    }
}