// The K Weakest Rows in a Matrix

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] s = new int[mat.length];
        int[] r = new int[k];
        for(int i = 0; i < mat.length; i++){
            int c = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    c++;
                }
            }
            s[i] = c;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[1] != b[1]){
                return Integer.compare(b[1], a[1]);   
            }
            else{
                return Integer.compare(b[0], a[0]);
            }
        });
        for(int i = 0; i < mat.length; i++){
            pq.offer(new int[]{i, s[i]});
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            r[--k] = pq.poll()[0];
        }
        return r;
    }
}