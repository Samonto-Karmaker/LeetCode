// can-place-flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean left = false;
        boolean right = false;
        for (int i = 0; i < flowerbed.length; i++) {
            left = i == 0 || flowerbed[i - 1] == 0;
            right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
            if (left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}