package Solution1;

import java.util.Scanner;
class TreeNode{
    char val;
    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode(char x){
        val=x;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            TreeNode root=preorder(str);
            midisequence(root);
            System.out.println();
        }
    }
     static int index=0;
    private static TreeNode preorder(String line){
        char ch=line.charAt(index);
        if(ch=='#'){
            return null;
        }
        TreeNode root=new TreeNode(ch);
        index++;
        root.left=preorder(line);
        index++;
        root.right=preorder(line);
        return root;
    }
    private static void midisequence(TreeNode root){
        if(root==null) return;
        midisequence(root.left);
        System.out.print(root.val+" ");
        midisequence(root.right);
    }
}