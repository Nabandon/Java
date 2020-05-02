package Solution1;



import java.lang.reflect.Array;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode next = null;

    TreeNode(int val) {
        this.val = val;
    }
}
public class Match {
   public boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null){
            return true;
        }
        if(pRoot.left==null && pRoot.right==null){
            return true;
        }
        if(pRoot.left==null || pRoot.right==null){
            return false;
        }
        if(pRoot.left.val==pRoot.right.val){
            return help(pRoot.left,pRoot.right);
        }
        return false;
    }
        private boolean help(TreeNode l,TreeNode r){
       if(l==null && r==null) {
           return true;
       }
       if(l==null || r==null){
           return false;
       }
        if(l.val!=r.val){
        return false;
        }
        return help(l.right,r.left) && help(l.left,r.right);
   }
}
