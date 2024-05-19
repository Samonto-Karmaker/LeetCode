// Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
                carry = true;
            }
            else{
                digits[i]++;
                carry = false;
                break;
            }
        }
        if(carry){
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for(int i = 1; i < newDigits.length; i++){
                newDigits[i] = digits[i - 1];
            }
            return newDigits;
        }
        return digits;
    }
}