package FindIndexOfFirstOccurrenceInString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("hello", "ll", 2),
                Arguments.of("a", "a", 0),
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("leetcode", "leeto", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String haystack, String needle, int expected) {
        assertEquals(expected, solution.strStr(haystack, needle));
    }
}