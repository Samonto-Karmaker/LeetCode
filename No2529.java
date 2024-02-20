// maximum-count-of-positive-integer-and-negative-integer

class Solution {
    public int maximumCount(int[] nums) {
        int nCount = 0;
        int i = 0;
        for(;i < nums.length; i++){
            if(nums[i] < 0) nCount++;
            if(nums[i] > 0) break;
        }
        return Math.max(nCount, nums.length - i);
    }
}