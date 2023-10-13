package MinCostClimbingStairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of(new int[]{10,15,20}, 15),
            Arguments.of(new int[]{1,100,1,1,1,100,1,1,100,1}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums, int expected) {
        assertEquals(expected, solution.minCostClimbingStairs(nums));
    }

}