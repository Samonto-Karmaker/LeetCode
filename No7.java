// reverse-integer

class Solution {
    public int reverse(int x) {
        int r = 0;
        boolean isNeg = false;
        if(x < 0) {
            isNeg = true;
            x = -1 * x;
        }
        while(x != 0) {
            int ld = x % 10;
            if(r > (Integer.MAX_VALUE - ld) / 10) return 0;
            r = r * 10 + ld;
            x /= 10;
        }
        return isNeg ? -1 * r : r;
    }
}