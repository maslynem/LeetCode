package ReconstructItinerary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;


    @BeforeEach
    void initializeSolution() {
        solution = new Solution();
    }
    @Test
    void test1() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC","LHR"));
        tickets.add(Arrays.asList("JFK","MUC"));
        tickets.add(Arrays.asList("SFO","SJC"));
        tickets.add(Arrays.asList("LHR","SFO"));
        List<String> expected = Arrays.asList("JFK","MUC","LHR","SFO","SJC");
        assertEquals(expected, solution.findItinerary(tickets));
    }
    @Test
    void test2() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("JFK", "SFO"));
        tickets.add(Arrays.asList("JFK", "ATL"));
        tickets.add(Arrays.asList("SFO", "ATL"));
        tickets.add(Arrays.asList("ATL", "JFK"));
        tickets.add(Arrays.asList("ATL", "SFO"));
        List<String> expected = Arrays.asList("JFK","ATL","JFK","SFO","ATL","SFO");
        assertEquals(expected, solution.findItinerary(tickets));
    }
}