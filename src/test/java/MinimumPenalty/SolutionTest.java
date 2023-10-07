package MinimumPenalty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        String customers = "YYNY";
        assertEquals(2, solution.bestClosingTime(customers));
    }

    @Test
    void test2() {
        String customers = "NNNNN";
        assertEquals(0, solution.bestClosingTime(customers));
    }

    @Test
    void test3() {
        String customers = "YYYY";
        assertEquals(4, solution.bestClosingTime(customers));
    }

    @Test
    void test4() {
        String customers = "NYNNNYYN";
        assertEquals(0, solution.bestClosingTime(customers));
    }

    @Test
    void test5() {
        String customers = "YNYY";
        assertEquals(4, solution.bestClosingTime(customers));
    }

}