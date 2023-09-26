package IntersectionOfTwoLinkedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        ListNode prevA = headA;
        ListNode tempA = headA;
        while (tempA != null) {
            sizeA++;
            prevA = tempA;
            tempA = tempA.next;
        }
        int sizeB = 0;
        ListNode prevB = headB;
        ListNode tempB = headB;
        while (tempB != null) {
            sizeB++;
            prevB = tempB;
            tempB = tempB.next;
        }
        if (prevA != prevB) {
            return null;
        }
        while (sizeA > sizeB) {
            sizeA--;
            headA = headA.next;
        }
        while (sizeA < sizeB) {
            sizeB--;
            headB = headB.next;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}