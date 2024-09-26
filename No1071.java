// greatest-common-divisor-of-strings

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!((str1 + str2).equals(str2 + str1))) return "";
        int gcd = findGCD(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
    private int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
}