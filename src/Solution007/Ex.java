package Solution007;



import java.util.HashMap;
import java.util.Map;

public  class Ex {
    public int sumNumbers (TreeNode root) {
        // write code here
        int res=0;
        if(root==null){
            return res;
        }
        return sum(root,res);
    }
    private int sum(TreeNode root, int res){
        if(root==null){
            return 0;
        }
        res=res*10+root.val;
        if(root.left==null && root.right==null){
            return res;
        }
        return sum(root.left,res)+sum(root.right,res);
    }
}
