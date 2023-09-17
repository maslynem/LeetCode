package LongestCommonPrefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new String[]{"flo","fwoj","flower"}, "f"),
                Arguments.of(new String[]{"flower","flow","fliwht"}, "fl"),
                Arguments.of(new String[]{"a"}, "a"),
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, "")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String[] strs, String expected) {
        assertEquals(expected, solution.longestCommonPrefix(strs));
    }

}