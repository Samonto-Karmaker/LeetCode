// count-negative-numbers-in-a-sorted-matrix

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            int l = 0;
            int r = grid[i].length - 1;
            if(grid[i][r] >= 0) continue;
            while(l <= r){
                if(grid[i][l] >= 0) l++;
                else{
                    count += r - l + 1;
                    break;
                }
            }
        }
        return count;
    }
}