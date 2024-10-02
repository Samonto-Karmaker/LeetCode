// decode-string

class Solution {
    public String decodeString(String s) {
        Stack<Integer> nStack = new Stack<>();
        Stack<String> sStack = new Stack<>();
        StringBuffer curr = new StringBuffer();
        int num = 0; 
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if(c == '[') {
                nStack.push(num);
                sStack.push(curr.toString());
                curr = new StringBuffer();
                num = 0;
            } else if(c == ']') {
                int repeatCount = nStack.pop();
                StringBuffer temp = new StringBuffer(sStack.pop());
                while(repeatCount-- > 0) {
                    temp.append(curr);
                }
                curr = temp;
            } else {
                curr.append(c);
            }
        }
        return curr.toString();
    }
}