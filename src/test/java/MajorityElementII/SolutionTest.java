package MajorityElementII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, List.of(3)),
                Arguments.of(new int[]{1}, List.of(1)),
                Arguments.of(new int[]{1, 2}, List.of(1, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums, List<Integer> expected) {
        assertEquals(expected, solution.majorityElement(nums));
    }

}