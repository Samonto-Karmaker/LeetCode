// path-sum

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return hasPathSumHelper(root, targetSum, 0);
    }

    private boolean hasPathSumHelper(TreeNode node, int targetSum, int currentSum) {
        if (node == null) return false;

        currentSum += node.val;

        // Check if it's a leaf node and the path sum equals targetSum
        if (node.left == null && node.right == null) {
            return currentSum == targetSum;
        }

        // Recur for left and right subtrees
        return hasPathSumHelper(node.left, targetSum, currentSum) || hasPathSumHelper(node.right, targetSum, currentSum);
    }
}
