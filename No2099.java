// Find Subsequence of Length K With the Largest Sum

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a, b) -> {
            return Integer.compare(a[0], b[0]);
        });

        PriorityQueue<int[]> pq2 = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(b[1], a[1]);
            } else {
                return Integer.compare(b[0], a[0]);
            }
        });

        int[] r = new int[k];
        for(int i = 0; i < nums.length; i++){
            int[] temp = {i, nums[i]};
            pq2.offer(temp);
        }
        for(int i = 0; i < k; i++){
            pq1.offer(pq2.poll());
        }
        for(int i = 0; i < k; i++){
            int temp = pq1.poll()[1];
            r[i] = temp;
        }
        return r;
    }
}