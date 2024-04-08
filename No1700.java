// number-of-students-unable-to-eat-lunch

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        int remaining = sandwiches.length;
        for(int student : students) count[student]++;
        for(int sandwich : sandwiches) {
            if(count[sandwich] == 0) break;
            if(remaining-- == 0) break;
            count[sandwich]--;
        }
        return remaining;
    }
}