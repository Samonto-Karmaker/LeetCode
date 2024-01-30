// Minimum Amount of Time to Fill Cups

class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < 3; i++){
            pq.offer(amount[i]);
        }
        int r = 0;
        while(pq.peek() > 0){
            int n1 = pq.poll();
            if(pq.peek() <= 0) return r + n1;
            int n2 = pq.poll();
            pq.offer(n1 - 1);
            pq.offer(n2 - 1);
            r++;
        }
        return r;
    }
}