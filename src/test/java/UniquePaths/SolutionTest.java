package UniquePaths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({"3, 7, 28", "3, 2, 3"})
    void test(int m, int n, int expected) {
        assertEquals(expected, solution.uniquePaths(m, n));
    }

}