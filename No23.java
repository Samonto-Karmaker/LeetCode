// merge-k-sorted-lists

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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];

        ListNode head = mergeTwoLists(lists[0], lists[1]);
        if(lists.length == 2) return head;

        for(int i = 2; i < lists.length; i++){
            head = mergeTwoLists(head, lists[i]);
        }

        return head;
    }
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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