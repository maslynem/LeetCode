package IntegerBreak;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "10,36",
            "8, 18",
            "2,1",
    })
    void test(int n, int expected) {
        assertEquals(expected, solution.integerBreak(n));
    }
}