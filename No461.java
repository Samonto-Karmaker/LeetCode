// Hamming Distance

class Solution {
    public int hammingDistance(int x, int y) {
        int dif = x ^ y;
        int count = 0;
        while(dif != 0){
            dif = dif & (dif - 1);
            count++;
        }
        return count;
    }
}