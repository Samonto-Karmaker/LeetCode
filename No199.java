// binary-tree-right-side-view

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        rightSideViewUtil(root, l, 0);
        return l;
    }
    private void rightSideViewUtil(TreeNode root, List<Integer> list, int level) {
        if(root == null) return;
        if(list.size() <= level) list.add(root.val);
        rightSideViewUtil(root.right, list, level + 1);
        rightSideViewUtil(root.left, list, level + 1);
    }
}