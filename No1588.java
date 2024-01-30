// Sum of All Odd Length Subarrays

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            for(int j = i + 1; j < arr.length; j++){
                n = i + j;
                if(n % 2 == 0){
                    for(int k = i; k <= j; k++){
                        sum += arr[k];
                    }
                }
            }
        }
        return sum;
    }
}