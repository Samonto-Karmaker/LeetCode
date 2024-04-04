// find-first-and-last-position-of-element-in-sorted-array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] r = new int[2];
        r[0] = binarySearch(nums, target, true);
        r[1] = binarySearch(nums, target, false);
        return r;
    }
    public int binarySearch(int[] a, int n, boolean isSearchingLeft) {
        int l = 0;
        int r = a.length - 1;
        int idx = -1;
        while(l <= r) {
            int mid = (l + r) / 2;
            if(a[mid] == n) {
                idx = mid;
                if(isSearchingLeft) r = mid - 1;
                else l = mid + 1;
            }
            else if(a[mid] > n) r = mid - 1;
            else l = mid + 1;
        }
        return idx;
    }
}