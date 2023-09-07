package ReverseLinkedListII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int[] expected = {1, 4, 3, 2, 5};
        ListNode listNode = solution.reverseBetween(node1, 2, 4);
        for (int j : expected) {
            assertNotNull(listNode);
            assertEquals(j, listNode.val);
            listNode = listNode.next;
        }
        assertNull(listNode);
    }

    @Test
    void test2() {
        ListNode node = new ListNode(5);
        ListNode listNode = solution.reverseBetween(node, 1, 1);
        assertNotNull(listNode);
        assertEquals(5, listNode.val);
        assertNull(listNode.next);
    }

    @Test
    void test3() {
        ListNode node = new ListNode(3, new ListNode(5));
        ListNode listNode = solution.reverseBetween(node, 1, 1);
        assertNotNull(listNode);
        assertEquals(3, listNode.val);
        listNode = listNode.next;
        assertEquals(5, listNode.val);
        assertNull(listNode.next);
    }

    @Test
    void test4() {
        ListNode node = new ListNode(3, new ListNode(5));
        ListNode listNode = solution.reverseBetween(node, 1, 2);
        assertNotNull(listNode);
        assertEquals(5, listNode.val);
        listNode = listNode.next;
        assertEquals(3, listNode.val);
        assertNull(listNode.next);
    }

}