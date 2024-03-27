// remove-nth-node-from-end-of-list

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        for(ListNode node = head; node != null; node = node.next) {
            len++;
        }

        int pos = 1;
        ListNode node = head;
        while(pos < len - n) {
            node = node.next;
            pos++;
        }

        if(len == n) {
            head = head.next;
        }
        else if(node.next == null) {
            node = null;
        }
        else {
            node.next = node.next.next;
        }
        return head;
    }
}