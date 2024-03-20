// median-of-two-sorted-arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                merged[k] = nums1[i];
                i++;
            }
            else{
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        if(i < m){
            while(i < m) {
                merged[k] = nums1[i];
                k++;
                i++;
            }
        }
        if(j < n){
            while(j < n) {
                merged[k] = nums2[j];
                k++;
                j++;
            }
        }
        if(k % 2 == 0){
            return (merged[k / 2] + merged[(k - 1) / 2]) / 2.0;
        }
        return merged[k / 2];
    }
}