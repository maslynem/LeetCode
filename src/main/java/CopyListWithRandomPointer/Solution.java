package CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


/**
 * A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
 * <p>
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 * <p>
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
 * <p>
 * Return the head of the copied linked list.
 */
public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        Node copyHead = map.get(head);
        Node copy = copyHead;
        while (head != null) {
            if (head.next != null) {
                copy.next = map.get(head.next);
            }
            if (head.random != null) {
                copy.random = map.get(head.random);
            }
            head = head.next;
            copy = copy.next;
        }
        return copyHead;
    }
}