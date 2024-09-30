// max-number-of-k-sum-pairs

class Solution {
    public int maxOperations(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= k) nums[i] = 0;
        }
        Arrays.sort(nums);
        if(nums[nums.length - 1] == 0) return 0;

        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == k) {
                result++;
                left++;
                right--;
            }
            else if(sum > k) right--;
            else left++;
        }
        return result;
    }
}