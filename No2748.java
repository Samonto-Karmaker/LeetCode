// Number of Beautiful Pairs

class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            String s = "" + nums[i];
            int fd = (int) (s.charAt(0) - '0');
            System.out.println(fd);
            for(int j = i + 1; j < nums.length; j++){
                int ld = nums[j] % 10;
                if(gcd(fd, ld) == 1){
                    count++;
                }
            }
        }
        return count;
    }
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}