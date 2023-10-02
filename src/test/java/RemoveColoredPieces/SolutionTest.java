package RemoveColoredPieces;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
          Arguments.of("ABBBBBBBAAA", false),
          Arguments.of("AAA", true),
          Arguments.of("AAABABB", true),
          Arguments.of("AA", false),
          Arguments.of("BBB", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String colors, boolean expected) {
        assertEquals(expected, solution.winnerOfGame(colors));
    }

}