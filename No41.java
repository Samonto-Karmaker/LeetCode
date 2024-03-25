// first-missing-positive

// Approach 1: Using Sorting (O(n * log(n)))
class Solution {
    public int firstMissingPositive(int[] nums) {
        int missing = 1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(missing == nums[i]) missing = nums[i] + 1;
        }
        return missing;
    }
}

// Approach 2: Using an O(n) space (O(n))

class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];
        for(int i : nums){
            if(i > 0 && i <= nums.length){
                seen[i] = true;
            }
        }
        for(int i = 1; i < seen.length; i++){
            if(!seen[i]) return i;
        }
        return nums.length + 1;
    }
}