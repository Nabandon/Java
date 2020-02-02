package Test;

public class DleteVal {
    private ListNode deleteVal(ListNode head,int val){
        ListNode node=new ListNode(0);
        node.next=head;
        ListNode pre=node;
        for(pre.next=head;pre.next!=null;pre=pre.next){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }
        }
        return node.next;
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode node=new ListNode(0);
        node.next=head;
        ListNode cur=node;
        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }
            cur=cur.next;
        }
        return node.next;
    }
}
