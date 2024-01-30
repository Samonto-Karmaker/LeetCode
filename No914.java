// X of a Kind in a Deck of Cards

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length < 2) return false;
        int[] a = new int[10001];
        int max = 0;
        for(int i = 0; i < deck.length; i++){
            a[deck[i]]++;
            if(max < deck[i]) max = deck[i];
        }
        int g = 0;
        for(int i = 0; i <= max; i++){
            if(a[i] == 0) continue;
            if(g == 0) g = a[i];
            else{
                g = gcd(g, a[i]);
            }
        }
        if(g > 1) return true;
        return false;
    }
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}