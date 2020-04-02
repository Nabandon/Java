package Solution1;

import java.util.ArrayList;
import java.util.List;


public class Java_0402 {
   private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return res;
        res=heaper(root,0);
        return res;
    }
    private List<List<Integer>> heaper(TreeNode root, int level){
        if(level==res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        if(root.left!=null){
            heaper(root.left,level+1);
        }
        if(root.right!=null){
            heaper(root.right,level+1);
        }
        return res;
    }
}
