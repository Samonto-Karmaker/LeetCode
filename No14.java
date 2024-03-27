// longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        StringBuilder lcp = new StringBuilder("");
        for(String s : strs){
            if(min > s.length()) min = s.length();
        }
        for(int i = 0; i < min; i++){
            char temp = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
                char temp2 = strs[j].charAt(i);
                if(temp != temp2){
                    temp = '0';
                    break;
                }
            }
            if(temp == '0') break;
            lcp.append(temp);
        }
        return lcp.toString();
    }
}