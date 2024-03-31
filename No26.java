// remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int j = 0; // index of the non duplicate element
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}