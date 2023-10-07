package PascalsTriangle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int numRows = 5;
        List<Integer> first = Collections.singletonList(1);
        List<Integer> second = Arrays.asList(1, 1);
        List<Integer> third = Arrays.asList(1, 2, 1);
        List<Integer> fourth = Arrays.asList(1, 3, 3, 1);
        List<Integer> fifth = Arrays.asList(1, 4, 6, 4, 1);
        List<List<Integer>> expected = new ArrayList<>(numRows);
        expected.add(first);
        expected.add(second);
        expected.add(third);
        expected.add(fourth);
        expected.add(fifth);

        List<List<Integer>> generate = solution.generate(numRows);

        assertEquals(numRows, generate.size());
        for (int i = 0; i < numRows; i++) {
            assertEquals(expected.get(i), generate.get(i));
        }
    }

    @Test
    void test2() {
        int numRows = 1;
        List<Integer> first = Collections.singletonList(1);
        List<List<Integer>> expected = new ArrayList<>(numRows);
        expected.add(first);

        List<List<Integer>> generate = solution.generate(numRows);

        assertEquals(numRows, generate.size());
        for (int i = 0; i < numRows; i++) {
            assertEquals(expected.get(i), generate.get(i));
        }
    }

}