// Prime In Diagonal

class Solution {
    public int diagonalPrime(int[][] nums) {
        int n1 = 2;
        boolean f = false;
        for(int i = 0; i < nums.length; i++){
            int j = nums.length - i - 1;
            if((isPrime(nums[i][i])) && (n1 <= nums[i][i])){
                n1 = nums[i][i];
                f = true;
            }
            if((isPrime(nums[i][j])) && (n1 <= nums[i][j])){
                n1 = nums[i][j];
                f = true;
            }
        }
        if(f) return n1;
        return 0;
    }
    public boolean isPrime(int n){
        int end = (int) Math.sqrt(n);
        for(int i = 2; i <= end; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}