// find-the-index-of-the-first-occurrence-in-a-string

// Approach 1: Two Pointers

class Solution {
    public int strStr(String haystack, String needle) {

        if((haystack.length() == 1) && haystack.equals(needle)) return 0;
        int i = 0;
        int j = 1;
        while(j <= haystack.length()) {
            if(haystack.substring(i, j).contains(needle)) {
                while(!(haystack.substring(i, j).equals(needle))) i++;
                if(haystack.substring(i, j).equals(needle)) {
                    return i;
                }
            }
            j++;
        }
        return -1;
    }
}

// Approach 2: Built-in Function

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

// Approach 3: Substring & StartsWith

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.substring(i).startsWith(needle)) return i;
        }
        return -1;
    }
}