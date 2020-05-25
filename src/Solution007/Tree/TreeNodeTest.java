package Solution007.Tree;

import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode(int val){
        this.val=val;
    }
}
public class TreeNodeTest {
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        ArrayList<Integer> list=new ArrayList<>();
        helper(res,list,root,sum);
        return res;
    }
    private void helper(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list,TreeNode root,int sum){
        if(root==null){
            return ;
        }
        list.add(root.val);
        if(root.left==null && root.right==null && root.val==sum){
            res.add(new ArrayList(list));
        }
        if(root.left!=null){
            helper(res,list,root.left,sum-root.val);
            list.remove(list.size()-1);
        }
        if(root.right!=null){
            helper(res,list,root.right,sum-root.val);
            list.remove(list.size()-1);
        }
    }
}
