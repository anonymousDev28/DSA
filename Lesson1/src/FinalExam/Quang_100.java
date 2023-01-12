package FinalExam;

public class Quang_100 {
    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        p1.left = p2;
        p1.right = p3;
        TreeNode q1 = new TreeNode(1);
        TreeNode q2 = new TreeNode(2);
        TreeNode q3 = new TreeNode(4);
        q1.left = q2;
        q1.right = q3;
        System.out.println(isSameTree(p1,q1));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Time complexity : O(N)
    // Space complexity : O(N)
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // điều kiện dừng
        // trường hợp p và q đều null
        if (p == null && q == null) return true;
        // p hoặc p null
        if (q == null || p == null) return false;
        // value tại p và q khác nhau
        if (p.val != q.val) return false;
        // công thức đệ quy
        // 2 tree giống nhau khi p right/left tree giống nhau q right/left tree
        return isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left);
    }
}
