package AddStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of("11", "123", "134"),
            Arguments.of("456", "77", "533"),
            Arguments.of("0", "0", "0")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String num1, String num2, String expected) {
        assertEquals(expected, solution.addStrings(num1, num2));
    }

}