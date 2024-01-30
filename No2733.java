// Neither Minimum nor Maximum

class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length < 3) return -1;
        int min = Math.min(nums[0], nums[1]);
        int max = Math.max(nums[0], nums[1]);
        int num = nums[2];
        if(num < max){
            if(num > min){
                return num;
            }
            return min;
        }
        return max;
    }
}