package Solution007.Tree;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
}
    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;


         TreeNode(int val) {
            this.val=val;
        }
    }

    public class TreeNodeTest {
        public TreeNode sortedListToBST(ListNode head) {
            // write code here

            if (head == null) {
                return null;
            }
            if(head.next==null){
                return new TreeNode(head.val);
            }
            ListNode fast=head.next;
            ListNode slow=head;
            while(fast.next!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            TreeNode root=new TreeNode(slow.next.val);
            root.right=sortedListToBST(slow.next.next);
            slow.next=null;
            root.left=(sortedListToBST(head));
            return root;
        }
}
