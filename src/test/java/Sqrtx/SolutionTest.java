package Sqrtx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({"4,2",
            "8, 2",
            "2, 1"
    })
    void test(int x, int expected) {
        assertEquals(expected, solution.mySqrt(x));
    }

}