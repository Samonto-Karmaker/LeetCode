// peak-index-in-a-mountain-array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int mid = -1;
        while(l <= r){
            mid = (l + r) / 2;
            if(arr[mid + 1] < arr[mid] && arr[mid - 1] < arr[mid]) return mid;
            else if(arr[mid + 1] > arr[mid]) l = mid + 1;
            else if(arr[mid - 1] > arr[mid]) r = mid - 1;
        }
        return mid;
    }
}