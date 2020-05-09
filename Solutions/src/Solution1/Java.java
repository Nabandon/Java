package Solution1;

import java.util.Scanner;

public class Java {
    public int run(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l= run(root.left);
        int r= run(root.right);
        if(l==0 || r==0){
            return l+r+1;
        }
        return Math.min(l,r)+1;
    }

}
