package PaintingTheWalls;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{26,53,10,24,25,20,63,51}, new int[]{1,1,1,1,2,2,2,1}, 55),
                Arguments.of(new int[]{1,2,3,2}, new int[]{1,2,3,2}, 3),
                Arguments.of(new int[]{2,3,4,2}, new int[]{1,1,1,1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] cost, int[] time, int expected) {
        assertEquals(expected, solution.paintWalls(cost, time));
    }

}