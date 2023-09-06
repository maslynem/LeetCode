package SplitLinkedListInParts;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
 * <p>
 * The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
 * <p>
 * The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.
 */

public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] listNodes = new ListNode[k];
        if (head == null) return listNodes;
        int listSize = getListSize(head);
        int splitLength = listSize / k;
        int addLength = listSize % k;
        for (int i = 0; i < k && head != null; i++) {
            listNodes[i] = head;
            int nodeIndex = i >= addLength ? splitLength : splitLength + 1;
            ListNode lastSplitNode = get(head, nodeIndex - 1);
            head = lastSplitNode.next;
            lastSplitNode.next = null;
        }
        return listNodes;
    }

    private int getListSize(ListNode head) {
        int i = 0;
        while (head != null) {
            head = head.next;
            i++;
        }
        return i;
    }

    private ListNode get(ListNode head, int index) {
        while (index != 0) {
            head = head.next;
            index--;
        }
        return head;
    }
}