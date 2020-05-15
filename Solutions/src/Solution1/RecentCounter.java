package Solution1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class RecentCounter {
    class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode(int x){
        val=x;
    }
}
//镜像变换;
    public void Mirror(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node.left!=null||node.right!=null){
                TreeNode temp=node.left;
                node.left=node.right;
                node.right=temp;
            }
            if(node.left!=null) stack.push(node.left);
            if(node.right!=null) stack.push(node.right);
        }
    }
//树的子结构;
    public boolean HasSubtree(TreeNode s,TreeNode t) {
        if(s==null||t==null) return false;
        boolean ret=false;
        if(s.val==t.val){
            ret=sub(s,t);
        }
        return ret||HasSubtree(s.left,t)||HasSubtree(s.right,t);
    }
    private boolean sub(TreeNode s,TreeNode t){
        if(s==null&&t==null) return true;
        if(s!=null&&t==null) return true;
        if(s==null&&t!=null) return false;
        if(s.val!=t.val){
            return false;
        }
        return sub(s.left,t.left)&&sub(s.right,t.right);
    }
//给定一个二叉树，确定它是否是一个完全二叉树。
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;
        boolean isStep=false;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode cur=que.poll();
            if(!isStep){
                if(cur.left!=null && cur.right!=null){
                    que.offer(cur.left);
                    que.offer(cur.right);
                }else if(cur.left==null && cur.right!=null){
                    return false;
                }else if(cur.left!=null && cur.right==null){
                    isStep=true;
                    que.offer(cur.left);
                }else if(cur.left==null && cur.right==null){
                    isStep=true;
                }
            }else{
                if(cur.left!=null || cur.right!=null){
                    return false;
                }
            }
        }
        return true;
    }
//采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
//空节点用一对空括号 "()" 表示。而且要省略所有不影响字符串与原二叉树之间的一对一映射关系的空括号对。
    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        helper(t);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    StringBuilder sb=new StringBuilder();
    private void helper(TreeNode t){
        if(t==null) return ;
        sb.append("(");
        sb.append(t.val);
        helper(t.left);
        if(t.left==null && t.right!=null){
            sb.append("()");
        }
        helper(t.right);
        sb.append(")");

    }
//根据先序遍历和中序,创建二叉树;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        int val=preorder[0];
        if(preorder.length==1){
            return new TreeNode(val);
        }
        TreeNode  root=new TreeNode(val);
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==val){
                index=i;
            }
        }
        root.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),
                Arrays.copyOfRange(inorder,0,index));
        root.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),
                Arrays.copyOfRange(inorder,index+1,inorder.length) );
        return root;
    }

////输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        if(pRootOfTree.left==null && pRootOfTree.right==null){
            return pRootOfTree;
        }
        TreeNode left=Convert(pRootOfTree.left);
        TreeNode leftTail=left;
        while(leftTail!=null&&leftTail.right!=null) {
            leftTail=leftTail.right;
        }
        if(left!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        TreeNode right=Convert(pRootOfTree.right);
        if(right!=null){
            right.left=pRootOfTree;
            pRootOfTree.right=right;
        }
        return left==null?pRootOfTree:left;
    }

     //最近公共祖先;
//    private TreeNode lca=null;
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        isHas(root, p, q);
//        return lca;
//    }
//    private boolean isHas(TreeNode root,TreeNode p,TreeNode q){
//        if(root==null) return false;
//        int left= isHas(root.left,p,q)?1:0;
//        int right= isHas(root.right,p,q)?1:0;
//        int mid=(root==p||root==q)?1:0;
//        if(left+right+mid==2){
//            lca=root;
//        }
//        return left+mid+right>0;
//   }

   //相等的树;
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p==null&&q==null) return true;
//        if(p==null||q==null) return false;
//        if(p.val!=q.val) return false;
//        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
//    }
//    //子树;
//    public boolean isSubtree(TreeNode s, TreeNode t) {
//        if(s==null&&t==null) return true;
//        if(s==null||t==null) return false;
//        boolean ret=false;
//        if(s.val==t.val) {
//            ret= isSameTree(s,t);
//        }
//        return  ret||isSubtree(s.left,t)||isSubtree(s.right,t);
//    }
//    //最大深度;
//    public int maxDepth(TreeNode root) {
//        if(root==null) return 0;
//        if(root.left==null&&root.right==null) return 1;
//        int zuo=maxDepth(root.left)+1;
//        int you=maxDepth(root.right)+1;
//        return Math.max(zuo,you);
//    }
//    //平衡树;
//    public boolean isBalanced(TreeNode root) {
//            if(root==null) return true;
//            if(root.left==null && root.right==null) return true;
//            int leftDepth=maxDepth(root.left);
//            int rightDepth=maxDepth(root.right);
//            if(leftDepth-rightDepth<-1||leftDepth-rightDepth>1){
//                return false;
//            }
//            return isBalanced(root.left)&&isBalanced(root.right);
//    }
//    //镜像树;
//    public boolean isSymmetric(TreeNode root) {
//        if(root==null) return true;
//        return isMirror(root.left,root.right);
//    }
//    private boolean isMirror(TreeNode t1,TreeNode t2){
//        if(t1==null&&t2==null) return true;
//        if(t1==null||t2==null) return false;
//        if(t1.val!=t2.val) return false;
//        return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
//    }
//
//
}

