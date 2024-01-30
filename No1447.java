// Simplified Fractions

class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> s = new ArrayList<>();
        for(int i = 1; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                if(gcd(i, j) == 1) s.add(i + "/" + j);
            }
        }
        return s;
    }
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}