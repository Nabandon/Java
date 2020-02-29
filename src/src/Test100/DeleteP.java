package Test100;

public class DeleteP {
    public ListNode deleteDuplication(ListNode pHead){
        ListNode node=new ListNode(0);
        node.next=pHead;
        ListNode cur=node;
        ListNode pre=pHead;
        while(pre!=null){
            if(pre.next!=null&&pre.val==pre.next.val){
                while (pre.next!=null&&pre.val==pre.next.val){
                    pre=pre.next;
                }
                pre=pre.next;
                cur.next=pre;
            }else {
                cur=pre;
                pre=pre.next;
            }
        }
        return node.next;
    }
}
