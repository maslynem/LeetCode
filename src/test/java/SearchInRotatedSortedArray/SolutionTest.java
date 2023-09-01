package SearchInRotatedSortedArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
          Arguments.of(new int[]{4,5,6,7,0,1,2}, 4, 0),
          Arguments.of(new int[]{4,5,6,7,0,1,2}, 0, 4),
          Arguments.of(new int[]{4,5,6,7,0,1,2}, 3, -1),
          Arguments.of(new int[]{1}, 0, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void test(int[] nums, int target, int expected) {
        assertEquals(expected, solution.search(nums,target));
    }
}