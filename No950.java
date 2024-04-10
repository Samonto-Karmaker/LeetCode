// reveal-cards-in-increasing-order

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int idx = 0;
        int ideck = 0;
        int[] r = new int[deck.length];
        Queue<Integer> simulator = new LinkedList<>();
        for(int i = 0; i < r.length; i++) {
            simulator.offer(i);
        }
        while(simulator.size() > 1) {
            idx = simulator.remove();
            int temp = simulator.remove();
            simulator.offer(temp);
            r[idx] = deck[ideck];
            ideck++;
        }
        idx = simulator.remove();
        r[idx] = r[idx] = deck[ideck];
        return r;
    }
}