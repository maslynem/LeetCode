package IsomorphicStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("egg", "add", true),
                Arguments.of("foo", "bar", false),
                Arguments.of("paper", "title", true),
                Arguments.of("bbbaaaba", "aaabbbba", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, String t, boolean expected) {
        assertEquals(expected, solution.isIsomorphic(s, t));
    }

}