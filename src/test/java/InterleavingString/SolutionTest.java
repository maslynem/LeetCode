package InterleavingString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(value = {
            "aabcc, dbbca, aadbbcbcac",
            "'','',''",
            "aa, ab, aaba"
    })
    void testTrue(String s1, String s2, String s3) {
        assertTrue(solution.isInterleave(s1, s2, s3));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "aabcc, dbbca, aadbbbaccc",
            "aabccc, dbbca, aadbbcbcac",
    })
    void testFalse(String s1, String s2, String s3) {
        assertFalse(solution.isInterleave(s1, s2, s3));
    }

}