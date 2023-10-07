package FindTheDifference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("abcd", "abcde", 'e'),
                Arguments.of("", "y", 'y')
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, String t, char expected) {
        Assertions.assertEquals(expected, solution.findTheDifference(s, t));
    }
}