package NumberOfFlowersInFullBloom;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 6}, {3, 7}, {9, 12}, {4, 13}}, new int[]{2, 3, 7, 11}, new int[]{1, 2, 2, 2}),
                Arguments.of(new int[][]{{1, 10}, {3, 3}}, new int[]{3, 3, 2}, new int[]{2, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[][] flowers, int[] people, int[] expected) {
        assertArrayEquals(expected, solution.fullBloomFlowers(flowers, people));
    }
}