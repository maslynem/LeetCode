package KthSymbolInGrammar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of(5,12,1),
            Arguments.of(3,4,0),
            Arguments.of(1,1,0),
            Arguments.of(2,1,0),
            Arguments.of(2,2,1),
            Arguments.of(5,13,0),
            Arguments.of(6,22,1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int n, int k, int expected) {
        assertEquals(expected, solution.kthGrammar(n, k));
    }

}