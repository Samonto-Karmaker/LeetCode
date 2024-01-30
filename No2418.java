// Sort the People

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] s = new String[names.length];
        Map<Integer, String> map = new TreeMap<>();

        for(int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }
        
        List<String> v = new ArrayList<>(map.values());
        for(int i = 0; i < names.length; i++){
            s[names.length - 1 - i] = v.get(i);
        }
        return s;
    }
}