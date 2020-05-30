package Solution007.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public ArrayList<ArrayList<Integer>> levelOrderBottom (TreeNode root) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        if(root==null)return lists;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;
    }
    public TreeNode sortedArrayToBST (int[] num) {
        // write code here
        int len=num.length;
        if(num==null || len==0){
            return null;
        }
        if(len==1){
            return new TreeNode(num[0]);
        }
        return getTree(num,0,len-1);
    }
    private TreeNode getTree(int[] num,int start,int end){
        if(num==null || num.length==0 || end<start){
            return null;
        }
        if(start==end){
            return new TreeNode(num[end]);
        }
        int mid=start+(end-start+1)/2;
        TreeNode root=new TreeNode(num[mid]);
        root.left=getTree(num,start,mid-1);
        root.right=getTree(num,mid+1,end);
        return root;
    }
}
