// capacity-to-ship-packages-within-d-days

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = maxNum(weights);
        int max = sum(weights);
        int res = 0;
        while(min <= max){
            int mid = (min + max) / 2;
            if(isFeasible(weights, days, mid)){
                res = mid;
                max = mid - 1;
            }
            else min = mid + 1;
        }
        return res;
    }
    public int maxNum(int[] a){
        int max = -1;
        for(int i : a){
            if(i > max) max = i;
        }
        return max;
    }
    public int sum(int[] a){
        int sum = 0;
        for(int i : a) sum += i;
        return sum;
    }
    public boolean isFeasible(int[] a, int k, int res){
        int day = 1, sum = 0;
        for(int i : a){
            if(sum + i > res){
                day++;
                sum = i;
            }
            else sum += i;
        }
        return day <= k;
    }
}