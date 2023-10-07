package MaximumIceCreamBars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 4, 1}, 7, 4),
                Arguments.of(new int[]{10, 6, 8, 7, 7, 8}, 5, 0),
                Arguments.of(new int[]{1, 6, 3, 1, 2, 5}, 20, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] costs, int coins, int expected) {
        assertEquals(expected, solution.maxIceCream(costs, coins));
    }
}