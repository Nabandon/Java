package Solution1;



import java.lang.reflect.Array;
import java.util.*;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class Match {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null ) {
            return null;
        }
        TreeLinkNode t=pNode;
        if(t.right!=null){
            t=t.right;
            while (t.left!=null){
                t=t.left;
            }
            return t;
        }
        while(pNode.next!=null){
            if(pNode.next.left==pNode){
                return pNode.next;
            }
            pNode=pNode.next;
        }
        return null;
    }

}
