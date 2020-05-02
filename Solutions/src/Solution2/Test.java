package Solution2;


import java.util.Arrays;
import java.util.Stack;


public class Test {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null || k<=0){
            return null ;
        }
        Stack<TreeNode> stack=new Stack<>();

        TreeNode node=pRoot;
        int count=1;
        while (node!=null || !stack.isEmpty()) {
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            TreeNode newNode=stack.pop();
            if(count==k){
                return newNode;
            }
            count++;
            node=newNode.right;
        }
        return null;
    }
    
}
