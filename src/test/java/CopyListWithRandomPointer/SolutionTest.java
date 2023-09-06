package CopyListWithRandomPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();

    @Test
    void test1() {
        Node node7 = new Node(7);
        Node node13 = new Node(13);
        Node node11 = new Node(11);
        Node node10 = new Node(10);
        Node node1 = new Node(1);

        node7.next = node13;
        node13.next = node11;
        node13.random = node7;
        node11.next = node10;
        node11.random = node1;
        node10.next = node1;
        node10.random = node11;
        node1.random = node7;

        Node head = solution.copyRandomList(node7);
        Node curNode = node7;
        Node copyNext;
        Node copyRandom;
        while (curNode != null) {
            copyNext = head.next;
            copyRandom = head.random;

            assertNotSame(head, curNode);
            assertEquals(curNode.val, head.val);

            if (curNode.next != null) {
                assertNotSame(copyNext, curNode.next);
                assertNotNull(copyNext);
                assertEquals(curNode.next.val, copyNext.val);
            } else {
                assertNull(copyNext);
            }

            if (curNode.random != null) {
                assertNotSame(copyRandom, curNode.random);
                assertNotNull(copyRandom);
                assertEquals(curNode.random.val, copyRandom.val);
            } else {
                assertNull(copyRandom);
            }
            curNode = curNode.next;
            head = head.next;
        }
        assertNull(head);
    }

    @Test
    void test2() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);

        node1.next = node2;
        node1.random = node2;
        node2.random = node2;

        Node head = solution.copyRandomList(node1);
        Node curNode = node1;
        Node copyNext;
        Node copyRandom;
        while (curNode != null) {
            copyNext = head.next;
            copyRandom = head.random;

            assertNotSame(head, curNode);
            assertEquals(curNode.val, head.val);

            if (curNode.next != null) {
                assertNotSame(copyNext, curNode.next);
                assertNotNull(copyNext);
                assertEquals(curNode.next.val, copyNext.val);
            } else {
                assertNull(copyNext);
            }

            if (curNode.random != null) {
                assertNotSame(copyRandom, curNode.random);
                assertNotNull(copyRandom);
                assertEquals(curNode.random.val, copyRandom.val);
            } else {
                assertNull(copyRandom);
            }
            curNode = curNode.next;
            head = head.next;
        }
        assertNull(head);
    }
    @Test
    void test3() {
        Node node1 = new Node(3);
        Node node2 = new Node(3);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.random = node1;
        node2.next = node3;

        Node head = solution.copyRandomList(node1);
        Node curNode = node1;
        Node copyNext;
        Node copyRandom;
        while (curNode != null) {
            copyNext = head.next;
            copyRandom = head.random;

            assertNotSame(head, curNode);
            assertEquals(curNode.val, head.val);

            if (curNode.next != null) {
                assertNotSame(copyNext, curNode.next);
                assertNotNull(copyNext);
                assertEquals(curNode.next.val, copyNext.val);
            } else {
                assertNull(copyNext);
            }

            if (curNode.random != null) {
                assertNotSame(copyRandom, curNode.random);
                assertNotNull(copyRandom);
                assertEquals(curNode.random.val, copyRandom.val);
            } else {
                assertNull(copyRandom);
            }
            curNode = curNode.next;
            head = head.next;
        }
        assertNull(head);
    }
}