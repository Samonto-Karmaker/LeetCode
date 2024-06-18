// average-of-levels-in-binary-tree

// Solution 1: Using HashMap
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        averageOfLevelsUtil(root, map, 0);
        for(List<Integer> i : map.values()) {
            l.add(average(i));
        }
        return l;
    }
    private void averageOfLevelsUtil(TreeNode root, Map<Integer, List<Integer>> map, int level) {
        if(root == null) return;
        if(!map.containsKey(level)) {
            map.put(level, new ArrayList<Integer>());
        }
        map.get(level).add(root.val);
        averageOfLevelsUtil(root.left, map, level + 1);
        averageOfLevelsUtil(root.right, map, level + 1);
    }
    private double average(List<Integer> l) {
        int size = l.size();
        double sum = 0.0;
        for(int i = 0; i < size; i++) {
            sum += l.get(i);
        }
        return sum / size;
    }
}

// Solution 2: Using Queue
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int currentSize = q.size();
            double sum = 0.0;
            for(int i = 0; i < currentSize; i++) {
                TreeNode temp = q.poll();
                sum += temp.val;
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            result.add(sum / currentSize);
        }
        return result;
    }
}