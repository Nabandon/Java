package Test;

public class DeleteVal {
    public ListNode delete(ListNode head,int val){
       ListNode h=new ListNode(-1);
       h.next=head;
       ListNode cur=h;
        while(cur.next!=null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return h.next;
    }
}
