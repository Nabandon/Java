package prejact;


import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
public class Tree {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        ArrayList<Integer> list=new ArrayList<>();
        h(root,target,res,list);
        return res;
    }
    private void h(TreeNode root,int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        target-=root.val;
        if(root.left==null && root.right==null && target==0){
            res.add(new ArrayList<>(list));
        }
        h(root.left,target,res,list);
        h(root.right,target,res,list);
        list.remove(list.size()-1);
    }
    public long tree1 (int[] a) {
        // write code here
        int len=a.length;
        long res=0;
        for(int i=0;i<len;i++){
            int parent=i;
            int son=parent*2+1;
            if(son<len){
                res+=(a[parent]^a[son]);

            }else{
                break;
            }
            if(son+1<len){
                res+=(a[parent]^a[son+1]);
            }else{
                break;
            }
        }
        return res;
    }
}
