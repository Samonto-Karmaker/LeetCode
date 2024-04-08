// merge-in-between-linked-lists

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l = new ListNode();
        ListNode r = new ListNode();
        int i = 0;
        for(ListNode n = list1; i <= b; n = n.next) {
            if(i == a - 1) l = n;
            else if(i == b) r = n.next;
            i++;
        }
        l.next = list2;
        for(ListNode n = list2; n != null; n = n.next){
            if(n.next == null) {
                n.next = r;
                break;
            }
        }
        return list1;
    }
}