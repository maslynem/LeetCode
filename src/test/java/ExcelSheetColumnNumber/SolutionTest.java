package ExcelSheetColumnNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("FXSHRXW", 2147483647),
                Arguments.of("AB", 28),
                Arguments.of("A", 1),
            Arguments.of("ZY", 701)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String columnTitle, int expected) {
        Assertions.assertEquals(expected, solution.titleToNumber(columnTitle));
    }

}