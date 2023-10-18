package NumberOfSegmentsInString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("Hello, my name is John", 5),
                Arguments.of("Hello", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String s, int expected) {
        assertEquals(expected, solution.countSegments(s));
    }
}