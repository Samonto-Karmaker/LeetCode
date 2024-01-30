// Divide Array Into Equal Pairs

import java.util.Arrays;
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2){
            if((nums[i] ^ nums[i+1]) != 0){
                return false;
            }
        }
        return true;
    }
}