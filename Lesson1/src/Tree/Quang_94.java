package Tree;

import java.util.LinkedList;
import java.util.List;

public class Quang_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorder(root,result);
        return result;
    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
