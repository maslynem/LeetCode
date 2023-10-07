package TextJustification;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        String[] input = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = Arrays.asList("This    is    an", "example  of text", "justification.  ");

        assertIterableEquals(result, solution.fullJustify(input, maxWidth));
    }

    @Test
    void test2() {
        String[] input = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 16;
        List<String> result = Arrays.asList("What   must   be", "acknowledgment  ", "shall be        ");

        assertIterableEquals(result, solution.fullJustify(input, maxWidth));
    }

    @Test
    void test3() {
        String[] input = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth = 20;
        List<String> result = Arrays.asList("Science  is  what we", "understand      well", "enough to explain to", "a  computer.  Art is", "everything  else  we", "do                  ");

        assertIterableEquals(result, solution.fullJustify(input, maxWidth));
    }

}