// The kth Factor of n

class Solution {
    public int kthFactor(int n, int k) {
        for(int i = 1; i <= n; i++){
            if(k <= 0) break;
            if(n % i == 0){
                if(k == 1){
                    return i;
                }
                k--;
            }
        }
        return -1;
    }
}