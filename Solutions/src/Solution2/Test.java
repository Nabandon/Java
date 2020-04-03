package Solution2;


import java.util.Arrays;

public class Test {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {


        if(pre.length == 0){
            return null;
        }
        int rootVal = pre[0];
        if(pre.length == 1){
            return new TreeNode(rootVal);
        }
          TreeNode root = new TreeNode(rootVal);
        int rootIndex = 0;
        for(int i=0;i<in.length;i++){
            if(rootVal == in[i]){
                rootIndex = i;
                break;
            }
        }
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),
                                                Arrays.copyOfRange(in,0,rootIndex));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),
                                                Arrays.copyOfRange(in,rootIndex+1,in.length));
        return root;
    }
}
