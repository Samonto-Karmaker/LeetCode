// convert-binary-number-in-a-linked-list-to-integer

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
    public int getDecimalValue(ListNode head) {
        int size = -1;
        int r = 0;
        for(ListNode n = head; n != null; n = n.next) size++;
        for(ListNode n = head; n != null; n = n.next) r += (n.val * (int) Math.pow(2, size--));
        return r;
    }
}