package Solution1;

import Solution2.TreeNode;

import java.util.*;

public class Test001 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int count=queue.size();
            while (count>0){
                TreeNode tem=queue.poll();
                if(tem.left!=null) queue.offer(tem.left);
                if(tem.right!=null) queue.offer(tem.right);
                if(count==1) list.add(tem.val);
                count--;
            }
        }
        return list;
    }
}