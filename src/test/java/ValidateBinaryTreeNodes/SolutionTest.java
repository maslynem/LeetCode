package ValidateBinaryTreeNodes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(4, new int[]{1, -1, 3, -1}, new int[]{2, -1, -1, -1}, true),
                Arguments.of(4, new int[]{1, -1, 3, -1}, new int[]{2, 3, -1, -1}, false),
                Arguments.of(2, new int[]{1, 0}, new int[]{-1, -1}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int n, int[] leftChild, int[] rightChild, boolean expected) {
        assertEquals(expected, solution.validateBinaryTreeNodes(n, leftChild, rightChild));
    }

}