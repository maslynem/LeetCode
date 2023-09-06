package SplitLinkedListInParts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {
    private static final Solution solution = new Solution();

    private static int getListSize(ListNode head) {
        int i = 0;
        while (head != null) {
            head = head.next;
            i++;
        }
        return i;
    }

    @Test
    void test1() {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode[] listNodes = solution.splitListToParts(node1, 5);
        assertEquals(5, listNodes.length);
        int i = 1;
        for (ListNode node : listNodes) {
            if (i < 4) {
                assertEquals(i++, node.val);
                assertNull(node.next);
            } else {
                assertNull(node);
            }
        }
    }

    @Test
    void test2() {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10))))))))));
        ListNode[] listNodes = solution.splitListToParts(node1, 3);
        assertEquals(3, listNodes.length);
        int i = 0;
        for (ListNode node : listNodes) {
            int listSize = getListSize(node);
            int expectedSize = i == 0 ? 4 : 3;
            assertEquals(expectedSize, listSize);
            i++;
        }
    }

    @Test
    void test3() {
        ListNode node1 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        ListNode[] listNodes = solution.splitListToParts(node1, 3);
        assertEquals(3, listNodes.length);
        int i = 0;
        for (ListNode node : listNodes) {
            int listSize = getListSize(node);
            int expectedSize = i == 2 ? 1 : 2;
            assertEquals(expectedSize, listSize);
            i++;
        }
    }
}
