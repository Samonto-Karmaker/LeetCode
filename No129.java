// sum-root-to-leaf-numbers

class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbersUtil(root, 0);
    }
    public int sumNumbersUtil(TreeNode root, int sum) {
        if (root == null) return 0;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) return sum;
        return sumNumbersUtil(root.left, sum) + sumNumbersUtil(root.right, sum);
    }
}