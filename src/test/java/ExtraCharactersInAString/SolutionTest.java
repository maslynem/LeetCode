package ExtraCharactersInAString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("leetscode", new String[]{"leet", "code", "leetcode"}, 1),
                Arguments.of("sayhelloworld", new String[]{"hello", "world"}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void test(String s, String[] dictionary, int expected) {
        assertEquals(expected, solution.minExtraChar(s, dictionary));
    }
}