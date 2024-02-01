// Pow(x, n)

class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1 || x == 1) return x;
        if(n < 0) {
            n = -n;
            x = 1 / x;
        }
        double r = 1;
        while(n != 0){
            if((n & 1) == 1){
                r *= x;
            }
            x *= x;
            n /= 2;
        }
        return r;
    }
}