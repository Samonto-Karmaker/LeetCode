// insert-greatest-common-divisors-in-linked-list
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        for(ListNode n = head; n.next != null; n = n.next.next){
            int g = gcd(n.val, n.next.val);
            ListNode node = new ListNode(g, n.next);
            n.next = node;
        }
        return head;
    }
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}