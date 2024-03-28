// merge-two-sorted-lists

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode currentNode = dummy;
        ListNode a = list1;
        ListNode b = list2;

        while(a != null && b != null){
            ListNode c = new ListNode();
            if(a.val <= b.val){
                c = a;
                a = a.next;
                c.next = null;
            }
            else{
                c = b;
                b = b.next;
                c.next = null;
            }
            currentNode.next = c;
            currentNode = c;
        }
        if(a == null) currentNode.next = b;
        else currentNode.next = a;

        return dummy.next;
    }
}