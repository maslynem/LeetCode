package RemoveLinkedListElements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    private ListNode createList(int... vals) {
        if (vals.length == 0) return null;
        ListNode head = new ListNode(vals[0]);
        ListNode temp = head;
        for (int i = 1; i < vals.length; i++) {
            temp.next = new ListNode(vals[i]);
            temp = temp.next;
        }
        return head;
    }

    static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{7,7,7,7}, new int[]{}, 7),
                Arguments.of(new int[]{1,2,6,3,4,5,6}, new int[]{1,2,3,4,5}, 6),
                Arguments.of(new int[]{}, new int[]{}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
     void removeNodesWithVal6(int[] list, int[] expected, int val) {
        ListNode head = createList(list);
        ListNode expectedList = createList(expected);
        ListNode newList = solution.removeElements(head, val);
        for (int i = 0; i < expected.length; i++) {
            assertNotNull(newList);
            assertEquals(expectedList.val, newList.val);
            expectedList = expectedList.next;
            newList = newList.next;
        }
        assertNull(newList);
    }

}