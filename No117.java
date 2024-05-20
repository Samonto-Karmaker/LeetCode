// populating-next-right-pointers-in-each-node-ii

// Recursive solution
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
        }
        if (root.left != null && root.right == null) {
            root.left.next = findNext(root.next);
        }
        if (root.right != null) {
            root.right.next = findNext(root.next);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }
    public Node findNext(Node root) {
        if (root == null) return null;
        if (root.left != null) return root.left;
        if (root.right != null) return root.right;
        return findNext(root.next);
    }
}

// Reversed BFS solution
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node prev = null;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                temp.next = prev;
                if (temp.right != null) q.offer(temp.right);
                if (temp.left != null) q.offer(temp.left);
                prev = temp;
            }
        }
        return root;
    }
}