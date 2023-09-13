package Candy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1,2,87,87,87,2,1}, 13),
                Arguments.of(new int[]{1,3,4,5,2}, 11),
                Arguments.of(new int[]{1,3,2,2,1}, 7),
                Arguments.of(new int[]{1,2,2}, 4),
                Arguments.of(new int[]{1,0,2}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] ratings, int expected) {
        assertEquals(expected, solution.candy(ratings));
    }
}