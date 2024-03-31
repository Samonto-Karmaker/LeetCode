// remove-element

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; // index of the non val element
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}