package GroupThePeopleGivenTheGroupSizeTheyBelongTo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int[] groupSizes = {3,3,3,3,3,1,3};
        List<List<Integer>> groups = new ArrayList<>();
        groups.add(Arrays.asList(0,1,2));
        groups.add(Collections.singletonList(5));
        groups.add(Arrays.asList(3,4,6));

        List<List<Integer>> lists = solution.groupThePeople(groupSizes);

        assertEquals(groups, lists);
    }
}