package AddBinary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of("11", "1", "100"),
            Arguments.of("1111", "1111", "11110"),
            Arguments.of("1010", "1011", "10101")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String a, String b, String expected) {
        Assertions.assertEquals(expected, solution.addBinary(a, b));
    }

}