package ReverseWordsInStringIII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"),
                Arguments.of("God Ding", "doG gniD")
        );
    }


    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, String expected) {
        Assertions.assertEquals(expected, solution.reverseWords(s));
    }
}