package Solution1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
   public void sequenceTraversal(TreeNode root){
       Queue<TreeNode> queue=new LinkedList<>();//创建一个队列,用来储存节点;
        queue.offer(root);//将根节点放入队列中;
        while(  !queue.isEmpty()){//循环取队首元素;
            TreeNode treeNode=queue.poll();//取队首元素;
            System.out.println(treeNode.val);//并打印;
            if(treeNode.left != null){//该节点的左子树不为空,就放入队列;
                queue.offer(treeNode.left);
            }
            if(treeNode.right != null){//该节点右子树不为空,就放入队列;
                queue.offer(treeNode.right);
            }
        }
   }
}

