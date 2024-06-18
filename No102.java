// binary-tree-level-order-traversal

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int currentSize = q.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i < currentSize; i++) {
                TreeNode temp = q.poll();
                tempList.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            l.add(tempList);
        }
        return l;
    }
}