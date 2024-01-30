// Number of Common Factors

class Solution {
    public int commonFactors(int a, int b) {
        int i = 1;
        int x = 0;
        while((i <= a) && (i <= b)){
            if((a % i == 0) && (b % i == 0)){
                x++;
            }
            i++;
        }
        return x;
    }
}