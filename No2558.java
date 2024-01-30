// Take Gifts From the Richest Pile

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : gifts){
            pq.offer(i);
        }
        int c = 0;
        while(c < k){
            pq.offer((int) Math.sqrt(pq.poll()));
            c++;
        }
        long remain = 0;
        while(!pq.isEmpty()){
            remain += pq.poll();
        }
        
        return remain;
    }
}