package prejact;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZhiPrint {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Stack<TreeNode> s=new Stack<>();
        s.push(pRoot);
        boolean f=true;
        while( !s.isEmpty()){
            while(!s.isEmpty()){
                q.offer(s.pop());
            }
            ArrayList<Integer> list=new ArrayList<>();
            if(f){
                while(!q.isEmpty()){
                    TreeNode t=q.poll();
                    list.add(t.val);
                    if(t.left!=null){
                        s.push(t.left);
                    }
                    if(t.right!=null){
                        s.push(t.right);
                    }
                }
                f=false;
                res.add(list);
            }else{
                while(!q.isEmpty()){
                    TreeNode t=q.poll();
                    list.add(t.val);
                    if(t.right!=null){
                        s.push(t.right);
                    }
                    if(t.left!=null){
                        s.push(t.left);
                    }
                }
                f=true;
                res.add(list);
            }
        }
        return res;
    }
}
