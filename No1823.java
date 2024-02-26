// find-the-winner-of-the-circular-game
// 1 based indexing algorithm
class Solution {
    public int findTheWinner(int n, int k) {
        return findTheWinner0(n, k) + 1;
    }
    public int findTheWinner0(int n, int k){
        if(n == 1) return 0;
        return (findTheWinner0(n - 1, k) + k) % n;
    }
}