// kids-with-the-greatest-number-of-candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = maxCandi(candies);
        for(int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
    private int maxCandi(int[] candies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        }
        return max;
    }
}