package Tree;

import java.util.LinkedList;
import java.util.List;

public class Quang_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        return createBST(nums, 0, nums.length - 1);
    }
    public TreeNode createBST(int a[], int left, int right ){
        if (left>right)
        {
            return null;
        }
        int mid = (left+right) / 2;
        TreeNode root = new TreeNode (a[mid]);
        root.left = createBST(a,left,mid-1);
        root.right = createBST(a, mid+1, right);
        return root;
    }
}
