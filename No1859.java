// Sorting the Sentence

class Solution {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        String out = "";
        for(int i = 0; i < a.length; i++){
            int temp = i + 1;
            for(String str : a){
                if(str.contains("" + temp)){
                    out += str.substring(0, str.length() - 1);
                    break;
                }
            }
            out += " ";
        }
        return out.trim();
    }
}