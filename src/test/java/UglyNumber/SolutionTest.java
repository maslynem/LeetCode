package UglyNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of(6, true),
            Arguments.of(1, true),
            Arguments.of(14, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int n, boolean expected) {
        assertEquals(expected, solution.isUgly(n));
    }
}