package WordPattern;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of("abba", "dog dog dog dog", false),
            Arguments.of("abba", "dog cat cat dog", true),
            Arguments.of("abba", "dog cat cat fish", false),
            Arguments.of("aaaa", "dog cat cat dog", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String pattern, String s, boolean expected) {
        assertEquals(expected, solution.wordPattern(pattern, s));
    }
}