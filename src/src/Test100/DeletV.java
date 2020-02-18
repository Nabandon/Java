package Test100;

public class DeletV {
    public ListNode deleteVal(ListNode head,int val){
        ListNode node=new ListNode(0);
        node.next=head;
        ListNode pre=node;
        ListNode cur=head;
        while (cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else {
                pre=cur;
            }
            cur=cur.next;
        }
        return node.next;
    }

}
