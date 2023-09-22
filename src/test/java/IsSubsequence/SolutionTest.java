package IsSubsequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of("abc", "ahbgdc", true),
            Arguments.of("axc", "ahbgdc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, String t, boolean expected) {
        Assertions.assertEquals(expected, solution.isSubsequence(s,t));
    }
}