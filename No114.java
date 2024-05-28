// flatten-binary-tree-to-linked-list

// Given a binary tree, flatten it to a linked list in-place in pre order.
// Hint: Similar to reverse a linked list

class Solution {
    TreeNode head = null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        if (root.right != null) flatten(root.right);
        if (root.left != null) flatten(root.left);
        root.left = null;
        root.right = head;
        head = root;
    }
}