// Sort an Array

class Solution {
    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);
        return nums;
        
    }
    public void merge(int[] a, int l, int mid, int r){

        int[] b = new int[a.length];

        int i = l;
        int j = mid + 1;
        int k = l;
        while(i <= mid && j <= r){
            if(a[i] < a[j]){
                b[k] = a[i];
                i++;
            }
            else{
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i > mid){
            while(j <= r){
                b[k] = a[j];
                j++;
                k++;
            }
        }
        else{
            while(i <= mid){
                b[k] = a[i];
                i++;
                k++;
            }
        }

        for(k = l; k <= r; k++){
            a[k] = b[k];
        }

    }

    public void mergeSort(int[] a, int l, int r){
        if(l < r){
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }
}