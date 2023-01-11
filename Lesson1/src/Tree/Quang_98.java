package Tree;

public class Quang_98 {
    public TreeNode preNode = null;

    public boolean isValidBST(TreeNode root) {

        if (root != null) {
            if (!isValidBST(root.left)) return false;
            if (preNode != null && root.val <= preNode.val) return false;
            preNode = root;
            return isValidBST(root.right);
        }
        return true;
    }
}
