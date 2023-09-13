package BestTimeToBuyAndSellStock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{7,1,5,3,6,4}, 5),
                Arguments.of(new int[]{7,6,4,3,1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] prices, int expected) {
        assertEquals(expected, solution.maxProfit(prices));
    }
}