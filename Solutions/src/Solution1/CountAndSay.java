package Solution1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res=lists(root);
        int[][] input=new int[res.size()][];
        for(int i=0;i<res.size();i++){
            ArrayList<Integer> tem=res.get(i);
            int[] in=new int[tem.size()];
            for(int j=0;j<tem.size();j++){
                in[j]=tem.get(j);
            }
            input[i] =in;
        }
        return input;
    }
    private ArrayList<ArrayList<Integer>> lists(TreeNode root){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(root==null) {
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int count=q.size();
            ArrayList<Integer> in=new ArrayList<>();
            while(count>0) {
                TreeNode t=q.poll();
                in.add(t.val);
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
                count--;
            }
            list.add(in);
        }
        return list;
    }
}

