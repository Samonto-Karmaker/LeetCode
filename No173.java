// binary-search-tree-iterator

class BSTIterator {

    List<Integer> l;
    int index = 0;

    public BSTIterator(TreeNode root) {
        l = new ArrayList<>();
        inOrder(root);
    }
    
    public int next() {
        return l.get(index++);
    }
    
    public boolean hasNext() {
        return index < l.size();
    }

    private void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        l.add(root.val);
        inOrder(root.right);
    }
}