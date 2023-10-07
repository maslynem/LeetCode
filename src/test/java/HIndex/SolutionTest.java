package HIndex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 1}, 1),
                Arguments.of(new int[]{3, 0, 6, 1, 5}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] citations, int expected) {
        assertEquals(expected, solution.hIndex(citations));
    }
}