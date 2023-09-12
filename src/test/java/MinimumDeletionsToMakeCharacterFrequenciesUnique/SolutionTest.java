package MinimumDeletionsToMakeCharacterFrequenciesUnique;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("bbcebab", 2),
                Arguments.of("aab", 0),
                Arguments.of("aaabbbcc", 2),
                Arguments.of("ceabaacb", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, int expected) {
        assertEquals(expected, solution.minDeletions(s));
    }
}