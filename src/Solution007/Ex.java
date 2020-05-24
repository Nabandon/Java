package Solution007;



import java.util.*;
 class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }
public  class Ex {

    public void connect(TreeLinkNode root) {
        if(root==null){
            return ;
        }
        Queue<TreeLinkNode> q=new LinkedList<>();
        q.offer(root);
        int size=q.size();
        while(!q.isEmpty()){
            TreeLinkNode node=q.poll();
            size--;
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
            if(size==0){
                node.next=null;
                size=q.size();
            }else{
                node.next=q.peek();
            }
        }
    }
}
