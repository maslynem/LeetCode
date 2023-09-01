package ThreeSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)),
                        Arguments.of(new int[]{0, 1, 1}, Collections.emptyList()),
                        Arguments.of(new int[]{0, 0, 0}, Collections.singletonList(new int[]{0, 0, 0})))
                );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void test(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> lists = solution.threeSum(nums);
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), lists.get(i));
        }
    }
}