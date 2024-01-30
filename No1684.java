// Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count = words.length;

        int[] alpha = new int[26];
        for(char c : allowed.toCharArray()){
            alpha[c - 'a']++;
        }

        for(String i : words){
            for(char c : i.toCharArray()){
                if(alpha[c - 'a'] == 0){
                    count--;
                    break;
                }
            }
        }

        return count;

    }
}