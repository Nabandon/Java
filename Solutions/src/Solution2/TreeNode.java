package Solution2;

import java.util.Arrays;

public class TreeNode {
  public   int val;
   public TreeNode left;
   public TreeNode right;
   public  TreeNode root;
   TreeNode(int val){
        this.val=val;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0){
            return null;
        }
        int rootVal=preorder[0];
        if(preorder.length==1){
            return new TreeNode(rootVal);
        }
        TreeNode root =new TreeNode(rootVal);
        int i=0;
        for( i=0;i<preorder.length;i++){
            if(rootVal==inorder[i]){
                break;
            }
        }
        root.left=buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
        root.right=buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length), Arrays.copyOfRange(inorder,i+1,inorder.length));
        return root;
    }
}
