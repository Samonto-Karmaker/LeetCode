// find-all-duplicates-in-an-array

// Approach 1: Using O(n) space
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] count = new int[nums.length + 1];
        List<Integer> r = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(count[nums[i]] > 0) r.add(nums[i]);
            count[nums[i]]++;
        }
        return r;
    }
}

// Approach 2: Using O(1) space
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> r = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int index = num - 1;
            if(nums[index] < 0) r.add(num);
            nums[index] *= -1;
        }
        return r;
    }
}