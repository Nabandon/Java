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
    public boolean hasPathSum (TreeNode root, int sum) {

        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null && root.val==sum){
            return true;
        }
        boolean l= hasPathSum(root.left,sum-root.val);
        boolean r= hasPathSum(root.right,sum-root.val);
        return l||r;
    }
}
