// Make Array Zero by Subtracting Equal Amounts

class Solution {
    // Find the unique non-zero positive numbers
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(i > 0) set.add(i);
        }
        return set.size();
    }

}