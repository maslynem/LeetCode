package DecodedStringAtIndex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("a2b3c4d5e6f7g8h9", 9, "b"),
                Arguments.of("leet2code3", 10, "o"),
                Arguments.of("ha22", 5, "h"),
                Arguments.of("y959q969u3hb22odq595", 222280369, "y"),
                Arguments.of("a2345678999999999999999", 1, "a")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, int k, String expected) {
        Assertions.assertEquals(expected, solution.decodeAtIndex(s,k));
    }

}