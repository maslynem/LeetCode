package FindInMountainArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1,5,2}, 2, 2),
                Arguments.of(new int[]{0,1,2,4,2,1}, 3, -1),
                Arguments.of(new int[]{1,2,3,4,5,3,1}, 2, 1),
                Arguments.of(new int[]{1,2,3,4,5,3,1}, 3, 2)
        );
    }


    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(int[] arr, int target, int expected) {
        MountainArray mountainArray = getMountainArray(arr);
        assertEquals(expected, solution.findInMountainArray(target, mountainArray));
    }

    private MountainArray getMountainArray(int[] arr) {
        return new MountainArray() {
            private final int[] array = arr;
            @Override
            public int get(int index) {
                return array[index];
            }

            @Override
            public int length() {
                return array.length;
            }
        };
    }

}