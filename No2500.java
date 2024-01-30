// Delete Greatest Value in Each Row

class Solution {
    public int deleteGreatestValue(int[][] grid) {
       int res = 0;
       for(int[] a : grid){
           Arrays.sort(a);
       }
       for(int i = 0; i < grid[0].length; i++){
           int max = 0;
           for(int[] a : grid){
               if(max < a[i]) max = a[i];
           }
           res += max;
       }
       return res;
    }
}