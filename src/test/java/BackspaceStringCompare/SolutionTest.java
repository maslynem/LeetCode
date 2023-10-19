package BackspaceStringCompare;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("ab#c", "ad#c", true),
                Arguments.of("ab##", "c#d#", true),
                Arguments.of("a#c", "b", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, String t, boolean expected) {
        assertEquals(expected, solution.backspaceCompare(s, t));
    }

}