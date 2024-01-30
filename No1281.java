// Subtract the Product and Sum of Digits of an Integer

class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int add = 0;
        while(n != 0){
            prod *= n % 10;
            add += n % 10;
            n /= 10;
        }
        return prod - add;
    }
}