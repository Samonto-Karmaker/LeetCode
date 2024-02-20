// intersection-of-two-arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] t = new int[1001];
        int count = 0;
        for(int i : nums1){
            if(t[i] < 1) t[i] = 1;
        }
        for(int i : nums2){
            if(t[i] == 1){
                t[i] = 2;
                count++;
            }
        }
        int[] r = new int[count];
        int j = 0;
        for(int i = 0; i < 1001; i++){
            if(t[i] == 2) r[j++] = i;
        }
        return r;
    }
}