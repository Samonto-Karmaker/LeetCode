// Last Stone Weight

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones){
            pq.offer(i);
        }
        while(pq.size() > 1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            if(s1 == s2) continue;
            else pq.offer(s1 - s2);
        }
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}