package Solution1;



import javafx.scene.control.skin.SliderSkin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode next = null;

    TreeNode(int val) {
        this.val = val;
    }
}
public class Match {
    public ArrayList<ArrayList<Integer>> Print1(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null) {
            return res;
        }
        Stack<TreeNode> s1= new Stack<>();
        s1.push(pRoot);
        Stack<TreeNode> s2=new Stack<>();
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty()){
                ArrayList<Integer> list=new ArrayList<>();
                while(!s1.isEmpty()){
                    TreeNode t=s1.pop();
                    if(t.left!=null){
                        s2.push(t.left);
                    }
                    if(t.right!=null){
                        s2.push(t.right);
                    }
                    list.add(t.val);
                }
                res.add(list);
            }else {
                ArrayList<Integer> list=new ArrayList<>();
                while(!s2.isEmpty()){
                    TreeNode t=s2.pop();
                    if(t.right!=null){
                        s2.push(t.right);
                    }
                    if(t.left!=null){
                        s2.push(t.left);
                    }
                    list.add(t.val);
                }
                res.add(list);
            }
        }
        return res;
    }
    //
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null) {
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        int count=0;
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            count=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(count>0){
                TreeNode t=queue.poll();
                list.add(t.val);
                if(t.left!=null){
                    queue.offer(t.left);
                }
                if(t.right!=null){
                    queue.offer(t.right);
                }
                count--;
            }
            res.add(list);
        }
        return res;
    }
}
