package LongestValidParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        String s = "(()";
        assertEquals(2, solution.longestValidParentheses(s));
    }

    @Test
    void test2() {
        String s = ")()())";
        assertEquals(4, solution.longestValidParentheses(s));
    }

    @Test
    void test3() {
        String s = "";
        assertEquals(0, solution.longestValidParentheses(s));
    }

    @Test
    void test4() {
        String s = "()()(()";
        assertEquals(4, solution.longestValidParentheses(s));
    }

    @Test
    void test5() {
        String s = ")(())))(())())";
        assertEquals(6, solution.longestValidParentheses(s));
    }

    @Test
    void test6() {
        String s = ")()";
        assertEquals(2, solution.longestValidParentheses(s));
    }

}