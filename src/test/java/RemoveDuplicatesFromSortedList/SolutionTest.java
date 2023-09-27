package RemoveDuplicatesFromSortedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode newHead = solution.deleteDuplicates(head);
        assertEquals(1, newHead.val);
        newHead = newHead.next;
        assertEquals(2, newHead.val);
        newHead = newHead.next;
        assertNull(newHead);
    }
    @Test
    void test2() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(3)))));
        ListNode newHead = solution.deleteDuplicates(head);
        assertEquals(1, newHead.val);
        newHead = newHead.next;
        assertEquals(2, newHead.val);
        newHead = newHead.next;
        assertEquals(3, newHead.val);
        newHead = newHead.next;
        assertNull(newHead);
    }

}