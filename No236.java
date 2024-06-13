// lowest-common-ancestor-of-a-binary-tree

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        // If the current node is one of p or q, we return the current node
        if (root == p || root == q) return root;
        // Recurse on the left branch
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // Recurse on the right branch
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // If both nodes are on the left or right, the result is the left or right
        if (left != null && right != null) return root;
        // If only one node is on the left or right, the result is the left or right
        return left == null ? right : left;
    }
}