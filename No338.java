// Counting Bits

class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n + 1];
        int setCount = 0;
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            temp = i;
            while(temp != 0){
                temp = temp & (temp - 1);
                setCount++;
            }
            a[i] = setCount;
            setCount = 0;
        }
        return a;
    }
}