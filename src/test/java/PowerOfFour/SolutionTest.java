package PowerOfFour;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(2, false),
                Arguments.of(4, true),
                Arguments.of(8, false),
                Arguments.of(16, true),
                Arguments.of(32, false),
                Arguments.of(64, true),
                Arguments.of(256, true),
                Arguments.of(1024, true),
                Arguments.of(4096, true),
                Arguments.of(16384, true),
                Arguments.of(65536, true),
                Arguments.of(262144, true),
                Arguments.of(1048576, true),
                Arguments.of(4194304, true),
                Arguments.of(16777216, true),
                Arguments.of(67108864, true),
                Arguments.of(268435456, true),
                Arguments.of(1073741824, true),
                Arguments.of(1073741823, false),
                Arguments.of(2147483647, false),
                Arguments.of(5, false),
                Arguments.of(1, true),
                Arguments.of(406586896, false),
                Arguments.of(406586895, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int n, boolean expected) {
        assertEquals(expected, solution.isPowerOfFour(n));
    }

}