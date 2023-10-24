package NumberComplement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(5, 2),
                Arguments.of(1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int num, int expected) {
        assertEquals(expected, solution.findComplement(num));
    }

}