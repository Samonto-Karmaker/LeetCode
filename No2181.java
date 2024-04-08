// merge-nodes-in-between-zeros

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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int sum = 0;
        for(ListNode n = head.next; n != null; n = n.next) {
            if(n.val != 0) sum += n.val;
            else {
                current.next = new ListNode(sum);
                sum = 0;
                current = current.next;
            }
        }
        return dummy.next;
    }
}