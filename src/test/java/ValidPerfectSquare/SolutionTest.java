package ValidPerfectSquare;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of(16, true),
            Arguments.of(30935844, true),
            Arguments.of(30969225, true),
            Arguments.of(30969224, false),
            Arguments.of(14, false)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int num, boolean expected) {
        assertEquals(expected, solution.isPerfectSquare(num));
    }

}