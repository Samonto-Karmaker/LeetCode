// maximum-depth-of-binary-tree

class Solution {
    int ans = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}