// Sort Integers by The Number of 1 Bits

import java.util.Arrays;
class Solution {
    public int[] sortByBits(int[] arr) {
        int[] a = new int[arr.length];
        int[] b = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            a[i] = Integer.bitCount(arr[i]) * 10001 + arr[i];
        }
        Arrays.sort(a);
        for(int i = 0; i < arr.length; i++){
            b[i] = a[i] % 10001;
        }
        return b;
    }
}