package tasks;

/** 965. Univalued Binary Tree */
public class Task965 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

        // build tree

    }

    public boolean isUnivalTree(TreeNode root) {

        return univalTree(root, root.val);

    }

    public boolean univalTree(TreeNode root, int val) {
        if (root.left != null && (root.left.val != val || !univalTree(root.left, val))) {
            return false;
        }
        if (root.right != null && (root.right.val != val || !univalTree(root.right, val))) {
            return false;
        }
        return true;
    }
}
