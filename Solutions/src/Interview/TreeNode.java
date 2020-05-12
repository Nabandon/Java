package Interview;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val=val;
    }
}
class Tree {
    //先序
    public List<Integer> preOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode tem=stack.pop();
            list.add(tem.val);
            if(tem.right!=null){
                stack.push(tem.right);
            }
            if(tem.left!=null){
                stack.push(tem.left);
            }
        }
        return list;
    }
    //中序
    public List<Integer> inOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null || !stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else {
                cur=stack.pop();
                list.add(cur.val);
                cur=cur.right;
            }
        }
        return list;
    }
    //hou
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> statck=new Stack<>();
        TreeNode pre=null;
        statck.push(root);
        while(!statck.isEmpty()){
            TreeNode tem=statck.peek();
            if((tem.left==null && tem.right==null) ||
                    (tem.right==pre || tem.left==pre) && pre!=null){
                list.add(tem.val);
                pre=tem;
                statck.pop();
            }else{
                if(tem.right!=null) {
                    statck.push(tem.right);
                }
                if(tem.left!=null) {
                    statck.push(tem.left);
                }
            }
        }
        return list;
    }
}
