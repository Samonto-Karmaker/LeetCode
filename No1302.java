// deepest-leaves-sum

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        System.out.println(h);
        return deepestLeavesSum(root, h);
    }
    public int height(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public int deepestLeavesSum(TreeNode root, int height) {
        if(root == null) return 0;
        if(root.left == null && root.right == null && height == 1) return root.val;
        return deepestLeavesSum(root.left, height - 1) + deepestLeavesSum(root.right, height - 1);
    }
}