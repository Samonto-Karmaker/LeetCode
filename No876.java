// middle-of-the-linked-list

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        for(ListNode n = head; n != null; n = n.next) size++;

        int mid = size / 2;
        for(int i = 0; i < mid; i++) head = head.next;

        return head;
    }
}