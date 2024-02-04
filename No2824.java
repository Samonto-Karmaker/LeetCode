// count-pairs-whose-sum-is-less-than-target

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l = 0, r = nums.size() - 1;
        int count = 0;
        while(l <= r){
            boolean flag = false;
            if(nums.get(l) + nums.get(r) >= target){
                r--;
                continue;
            }
            else{
                count += r - l;
                l++;
                flag = true;
            }
            if(!flag) break;
        }
        return count;
    }
}