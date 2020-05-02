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
    String Serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        if(root==null){
            sb.append("#"+"!");
            return sb.toString();
        }
        sb.append(root.val+"!");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    int index=-1;
    TreeNode Deserialize(String str) {
        String[] strs=str.split("!");
        return helper(strs,strs.length);
    }
    private TreeNode helper(String[] strs,int len){
        index++;
        if(index>=len){
            return null;
        }
        TreeNode root=null;
        if(!strs[index].equals("#")) {
            root = new TreeNode(Integer.parseInt(strs[index]));
            root.left = helper(strs, len);
            root.right = helper(strs, len);
        }
        return root;
    }
}
