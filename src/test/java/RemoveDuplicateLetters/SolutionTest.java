package RemoveDuplicateLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("bcabc", "abc"),
                Arguments.of("cdbabc", "cdab"),
                Arguments.of("cbacdcbc", "acdb")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, String expected) {
        Assertions.assertEquals(expected, solution.removeDuplicateLetters(s));
    }

}