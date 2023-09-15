package MinCostToConnectAllPoints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[][]{{-14,-14},{-18,5},{18,-10},{18,18},{10,-2}}, 102),
                Arguments.of(new int[][]{{0,0}, {1,1}, {1,0}, {-1,1}}, 4),
                Arguments.of(new int[][]{{0,0}, {2,2}, {3,10}, {5,2}, {7,0}}, 20),
                Arguments.of(new int[][]{{3,12}, {-2,5}, {-4,1}}, 18)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[][] points, int expected) {
        assertEquals(expected, solution.minCostConnectPoints(points));
    }
}