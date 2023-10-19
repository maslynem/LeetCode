package FindAllNumbersDisappearedInAnArray;

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
            Arguments.of(new int[]{4,3,2,7,8,2,3,1}, List.of(5,6)),
            Arguments.of(new int[]{1,1}, List.of(2))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] nums, List<Integer> expected) {
        assertEquals(expected, solution.findDisappearedNumbers(nums));
    }

}