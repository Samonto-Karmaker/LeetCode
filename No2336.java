// Smallest Number in Infinite Set

class SmallestInfiniteSet {

    PriorityQueue<Integer> pq;
    HashSet<Integer> s;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        s = new HashSet<>();
        pq.offer(1);
    }
    
    public int popSmallest() {
        int n = pq.poll();
        while(!s.isEmpty() && s.contains(n)){
            n = pq.poll();
        }
        s.add(n);
        int temp = n + 1;
        pq.offer(temp);
        return n;
    }
    
    public void addBack(int num) {
        if(s.contains(num)){
            pq.offer(num);
            s.remove(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */