// Largest Number After Digit Swaps by Parity

class Solution {
    public int largestInteger(int num) {
        char[] a = String.valueOf(num).toCharArray();
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if((a[i] % 2 == a[j] % 2) && (a[i] < a[j])){
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return Integer.parseInt(new String(a));
    }
}