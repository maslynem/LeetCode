package HappyNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(2, false),
                Arguments.of(1, true),
                Arguments.of(7, true),
                Arguments.of(19, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int n, boolean expected) {
        Assertions.assertEquals(expected, solution.isHappy(n));
    }

}