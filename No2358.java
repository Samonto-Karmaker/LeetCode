// maximum-number-of-groups-entering-a-competition

class Solution {
    public int maximumGroups(int[] grades) {
        int increment = 1, count = 0;
        for(int i = 0; i < grades.length; i += increment){
            increment++;
            count++;
        }
        return count;
    }
}