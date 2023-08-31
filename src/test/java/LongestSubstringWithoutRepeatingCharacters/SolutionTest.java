package LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        String input = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void test2() {
        String input = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void test3() {
        String input = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(input));
    }
}