// removing-stars-from-a-string

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        while(!(stack.isEmpty())) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}