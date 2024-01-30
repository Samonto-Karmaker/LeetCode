// Difference Between Element Sum and Digit Sum of an Array

class Solution {
    public int differenceOfSum(int[] nums) {
        int x = 0;
        int y = 0;
        for(int i : nums){
            x += i;
            while(i != 0){
                y += i % 10;
                i /= 10;
            }
        }
        return Math.abs(x - y);
    }
}