// Distinct Prime Factors of Product of Array

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums){
            while(i % 2 == 0){
                s.add(2);
                i /= 2;
            }
            for(int j = 3; j <= (int) Math.sqrt(i); j += 2){
                while(i % j == 0){
                    s.add(j);
                    i /= j;
                }
            }
            if(i > 2){
                s.add(i);
            }
        }
        return s.size();
    }
}