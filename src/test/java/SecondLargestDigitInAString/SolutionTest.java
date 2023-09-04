package SecondLargestDigitInAString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(value = {"dfa12321afd, 2", "abc1111, -1"})
    void test(String s, int expected) {
        assertEquals(expected, solution.secondHighest(s));
    }

}