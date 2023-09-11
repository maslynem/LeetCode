package RemoveDuplicatesFromSortedArrayII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1,1,1,2,2,3}, 5, new int[]{1,1,2,2,3}),
                Arguments.of(new int[]{0,0,1,1,1,1,2,3,3}, 7, new int[]{0,0,1,1,2,3,3})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "argumentsStream")
    void test(int[] nums, int k, int[] expectedArray) {
        int i = solution.removeDuplicates(nums);
        assertEquals(k,i);
        for (int j = 0; j < k; j++) {
            assertEquals(expectedArray[j], nums[j]);
        }
    }
}