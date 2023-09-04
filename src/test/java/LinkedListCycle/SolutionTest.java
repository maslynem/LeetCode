package LinkedListCycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void fourNodeCycle() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        assertTrue(solution.hasCycle(node1));
    }

    @Test
    void twoNodeCycle() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;
        assertTrue(solution.hasCycle(node1));
    }

    @Test
    void twoNodeWithoutCycle() {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        assertFalse(solution.hasCycle(node1));
    }

    @Test
    void oneNodeWithoutCycle() {
        ListNode node1 = new ListNode(1);
        assertFalse(solution.hasCycle(node1));
    }

    @Test
    void nullTest() {
        assertFalse(solution.hasCycle(null));
    }

    @Test
    void tenNodeCycle() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node7;
        assertTrue(solution.hasCycle(node1));
    }

}