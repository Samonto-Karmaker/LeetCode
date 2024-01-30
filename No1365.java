// How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = new int[nums.length];
        int[] a = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            copy[i] = nums[i];
        }

        Arrays.sort(copy);

        for(int i = 0; i < nums.length; i++){
            int index = firstIndex(copy, nums[i]);
            a[i] = index;
        }
        return a;
    }

    public int firstIndex(int[] nums, int n){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n) return i;
        }
        return -1;
    }
}