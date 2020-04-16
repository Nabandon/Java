package Solution2;

public class BibarySearchTree {
    private TreeNode root=null;

    //查;
    private  TreeNode find(int val){
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val<val){
                cur=cur.right;
            }else if(cur.val>val){
                cur=cur.left;
            }else{
                return  cur;
            }
        }
        return  null;
    }
   //增;
    private boolean add(int val){
        if(root==null){
            root=new TreeNode(val);
            return true;
        }
        TreeNode parent=null;
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val<val){
                parent=cur;
                cur=cur.right;
            }else if(cur.val>val){
                parent=cur;
                cur=cur.left;
            }else {
                return  false;
            }
        }
        if(val>parent.val){
            parent.right=new TreeNode(val);
        }else{
            parent.left=new TreeNode(val);
        }
        return true;
    }
    private  boolean remove(int val){
        TreeNode parent=null;
        TreeNode cur=root;
        if(cur==null) return false;
        while(cur!=null){
            if(cur.val<val){
                parent=cur;
                cur=cur.right;
            }else if(cur.val>val){
                parent=cur;
                cur=cur.left;
            }else {
                 removeNode(parent,cur);
                 return  true;
            }
        }
        return  false;
    }
    private void removeNode(TreeNode parent,TreeNode cur){
        //被删除节点没有左子树;
        if(cur.left==null){
            if(cur==root){
                root=cur.root;
            }else if(cur==parent.left){
                parent.left=cur.right;
            }else {
                parent.right=cur.right;
            }
        }
        //要删除元素没有右子树;
        else if(cur.right==null){
            if(cur==root){
                root=cur.left;
            }else if(parent.left==cur){
                parent.left=cur.left;
            }else {
                parent.right=cur.left;
            }
        }else {
            //要删除既有左子树,也有右子树;
            //找到右子树最小的元素赋值给要删除的元素交换,再删除那个最小的元素即可;
            TreeNode tem=cur;
            parent=cur;
            cur=cur.right;
            while (cur.left!=null){
                    parent=cur;
                    cur=cur.left;
            }
            tem.val=cur.val;
            //此时,cur肯定没有左子树;
            if(parent.left==cur){
                parent.left=cur.right;
            }else {
                parent.right=cur.right;
            }
        }
    }
}
