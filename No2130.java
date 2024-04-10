// maximum-twin-sum-of-a-linked-list

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
    public int pairSum(ListNode head) {
        List<Integer> l = new ArrayList<>();
        for(ListNode n = head; n != null; n = n.next) l.add(n.val);

        int[] sum = new int[l.size() / 2];
        for(int i = 0; i < sum.length; i++) {
            sum[i] = l.get(i) + l.get(l.size() - 1 - i);
        }
        return maxInArray(sum);
    }
    public int maxInArray(int[] a) {
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            if(max < a[i]) max = a[i];
        }
        return max;
    }
}