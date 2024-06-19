// binary-tree-zigzag-level-order-traversal

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        boolean leftToRight = true;
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()) {
            int count = q.size();
            List<Integer> l = new ArrayList<>(count);
            
            for(int i = 0; i < count; i++){
                TreeNode cur = q.poll();
        
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);  

                if(leftToRight) l.add(cur.val);
                else l.add(0, cur.val); 
            }
            leftToRight = !leftToRight;
            ans.add(l);
        }
        return ans;
    }
}