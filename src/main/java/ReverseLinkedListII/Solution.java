package ReverseLinkedListII;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right) return head;
        int index = 1;
        ListNode resultHead = head;
        ListNode beforeStart = head;
        while (index != left) {
            beforeStart = head;
            head = head.next;
            index++;
        }
        ListNode start = head;
        while (index != right) {
            head = head.next;
            index++;
        }
        ListNode end = head;
        ListNode reverseList = reverseList(start, end);
        if (left == 1) {
            resultHead = reverseList;
        } else {
            beforeStart.next = reverseList;
        }
        return resultHead;
    }

    private ListNode reverseList(ListNode start, ListNode end) {
        ListNode lastNode = end.next;
        ListNode prev = lastNode;
        ListNode curr = start;
        while (curr != lastNode) {
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        return prev;
    }
}