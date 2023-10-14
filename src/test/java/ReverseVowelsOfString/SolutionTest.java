package ReverseVowelsOfString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of("hello", "holle"),
            Arguments.of("leetcode", "leotcede")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, String expected) {
        assertEquals(expected, solution.reverseVowels(s));
    }
}