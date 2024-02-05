// find-target-indices-after-sorting-array

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        int equalNum = 0, smallerNum = 0;
        for(int i : nums){
            if(i == target) equalNum++;
            else if(i < target) smallerNum++;
        }
        for(int i = 0; i < equalNum; i++){
            l.add(smallerNum++);
        }
        return l;
    }
}