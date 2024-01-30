// Sum of All Subset XOR Totals

class Solution {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        int c = (1 << nums.length); // number of possible combinations
        for(int i = 1; i < c; i++){
            int temp = 0;
            // max(number of bits of i) = nums.length
            for(int j = 0; j < nums.length; j++){ 
                if((i & (1 << j)) > 0){
                    //finding all the set bits of i
                    temp ^= nums[j];
                }
            }
            total += temp;
        }
        return total;
    }
}