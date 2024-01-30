// Relative Ranks

import java.util.PriorityQueue;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] r = new String[score.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));

        for (int i = 0; i < score.length; i++) {
            pq.offer(new int[]{i, score[i]});
        }

        for (int i = 0; i < score.length; i++) {
            int[] athlete = pq.poll();

            if (i == 0) {
                r[athlete[0]] = "Gold Medal";
            } else if (i == 1) {
                r[athlete[0]] = "Silver Medal";
            } else if (i == 2) {
                r[athlete[0]] = "Bronze Medal";
            } else {
                r[athlete[0]] = String.valueOf(i + 1);
            }
        }

        return r;
    }
}
