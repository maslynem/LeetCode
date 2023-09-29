package PascalsTriangleII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(3, List.of(1,3,3,1)),
                Arguments.of(0, List.of(1)),
                Arguments.of(1, List.of(1,1))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int rowIndex, List<Integer> expected) {
        assertEquals(expected, solution.getRow(rowIndex));
    }

}