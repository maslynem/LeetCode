package FindTheOriginalArrayOfPrefixXor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of(new int[]{5,2,0,3,1}, new int[] {5,7,2,3,2}),
            Arguments.of(new int[]{13}, new int[] {13})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] pref, int[] expected) {
        assertArrayEquals(expected, solution.findArray(pref));
    }

}