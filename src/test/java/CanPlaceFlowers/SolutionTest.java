package CanPlaceFlowers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1,0,0,0,1}, 1, true),
                Arguments.of(new int[]{0,0,1,0,1}, 1, true),
                Arguments.of(new int[]{1}, 0, true),
                Arguments.of(new int[]{1}, 1, false),
                Arguments.of(new int[]{0}, 1, true),
                Arguments.of(new int[]{0}, 0, true),
                Arguments.of(new int[]{1,0,0,0,1}, 2, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] flowerbed, int n, boolean expected) {
        assertEquals(expected, solution.canPlaceFlowers(flowerbed, n));
    }

}