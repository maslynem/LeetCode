package ReorganizeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        assertEquals("aba", solution.reorganizeString("aab"));
    }

    @Test
    void test2() {
        assertTrue(solution.reorganizeString("aaab").isEmpty());
    }

    @Test
    void test3() {
        String input = "aabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcd";
        assertFalse(solution.reorganizeString(input).isEmpty());
    }

    @Test
    void test4() {
        String input = "aabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcdaabbcaabcd";
        assertFalse(solution.reorganizeString(input).isEmpty());
    }

}