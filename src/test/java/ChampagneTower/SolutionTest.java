package ChampagneTower;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({"1,1,1,0", "2,1,1,0.5", "100000009, 33, 17, 1"})
    void test(int poured, int queryRow, int queryGlass, double expected) {
        assertEquals(expected, solution.champagneTower(poured, queryRow, queryGlass), 1e-7);
    }

}