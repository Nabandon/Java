package Solution007.Tree;

public class BinaryTree {
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
