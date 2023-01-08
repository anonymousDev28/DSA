package Tree;

import java.util.LinkedList;
import java.util.List;

public class Quang_145 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preorder(root,result);
        return result;
    }
    public void preorder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}
