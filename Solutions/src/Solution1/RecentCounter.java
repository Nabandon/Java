package Solution1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    class TreeNode{
    char val;
    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode(char x){
        val=x;
    }
}
    //最近公共祖先;
    private TreeNode lca=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isHas(root, p, q);
        return lca;
    }
    private boolean isHas(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return false;
        int left= isHas(root.left,p,q)?1:0;
        int right= isHas(root.right,p,q)?1:0;
        int mid=(root==p||root==q)?1:0;
        if(left+right+mid==2){
            lca=root;
        }
        return left+mid+right>0;
    }
    //相等的树;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }
    //子树;
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null&&t==null) return true;
        if(s==null||t==null) return false;
        boolean ret=false;
        if(s.val==t.val) {
            ret= isSameTree(s,t);
        }
        return  ret||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    //最大深度;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        int zuo=maxDepth(root.left)+1;
        int you=maxDepth(root.right)+1;
        return Math.max(zuo,you);
    }
    //平衡树;
    public boolean isBalanced(TreeNode root) {
            if(root==null) return true;
            if(root.left==null && root.right==null) return true;
            int leftDepth=maxDepth(root.left);
            int rightDepth=maxDepth(root.right);
            if(leftDepth-rightDepth<-1||leftDepth-rightDepth>1){
                return false;
            }
            return isBalanced(root.left)&&isBalanced(root.right);
    }
    //镜像树;
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null) return true;
        if(t1==null||t2==null) return false;
        if(t1.val!=t2.val) return false;
        return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
    }


}

