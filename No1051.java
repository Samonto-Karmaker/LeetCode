// Height Checker

class Solution {
    public int heightChecker(int[] heights) {
        int[] og = new int[heights.length];
        for(int i = 0; i < og.length; i++){
            og[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i < og.length; i++){
            if(og[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}