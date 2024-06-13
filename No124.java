// binary-tree-maximum-path-sum

class Solution {
    int ans = -1001;
    public int maxPathSum(TreeNode root) {
        maxPathSumUtil(root);
        return ans;
    }
    public int maxPathSumUtil(TreeNode root) {
        if (root == null) return 0;
        int leftSum = Math.max(maxPathSumUtil(root.left), 0);
        int rightSum = Math.max(maxPathSumUtil(root.right), 0);
        ans = Math.max(ans, leftSum + rightSum + root.val);

        // You can only choose 1 side
        return Math.max(leftSum, rightSum) + root.val;
    }
}