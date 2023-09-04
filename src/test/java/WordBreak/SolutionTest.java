package WordBreak;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("leetcode", Arrays.asList("leet","code"), true),
                Arguments.of("applepenapple", Arrays.asList("apple","pen"), true),
                Arguments.of("catsandog", Arrays.asList("cats","dog","sand","and","cat"), false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void test(String s, List<String> dic, boolean expected) {
        assertEquals(expected, solution.wordBreak(s, dic));
    }
}