package Solution1;

import Solution2.TreeNode;

import java.util.*;

import static java.lang.System.arraycopy;


public class Exe {
    //先序遍历;
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return  res;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            res.add(cur.val);
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null) {
                stack.push(cur.left);
            }
        }
        return  res;
    }
    //中序遍历;
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return  res;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode pre=root;
        while(true){
            while (pre!=null){
                stack.push(pre);
                pre=pre.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode cur=stack.pop();
            res.add(cur.val);
            pre=cur.right;
        }
        return res;
    }
    //后序遍历;
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode pre=root;
        TreeNode top=null;
        while(true){
            while (pre!=null){
                stack.push(pre);
                pre=pre.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode cur=stack.peek();
            if(cur.right==null||top==cur.right) {
                res.add(cur.val);
                stack.pop();
                top=cur;

            }else{
                pre=cur.right;
            }
        }
        return res;
    }
}
