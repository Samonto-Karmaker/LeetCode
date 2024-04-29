// count-nodes-equal-to-average-of-subtree

class Solution {
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;
        traverse(root);
        return count;
    }
    public int[] traverse(TreeNode root) {
        if(root == null) return new int[]{0, 0};
        int[] left = traverse(root.left);
        int[] right = traverse(root.right);
        int total = root.val + left[0] + right[0];
        int n = 1 + left[1] + right[1];
        if(root.val == (total / n)) count++;
        return new int[]{total, n};
    }
}
