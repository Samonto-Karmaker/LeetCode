// is-subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int position = 0;
        for(int i = 0; i < sArray.length; i++) {
            boolean flag = false;
            char sChar = sArray[i];
            for(int j = position; j < tArray.length; j++) {
                if(sChar == tArray[j]) {
                    position = j + 1;
                    flag = true;
                    break;
                }
            }
            if(!flag) return false;
        }
        return true;
    }
}