package Test;

public class ReverseListNode {
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null);{
            pre=cur;
            ListNode temp=cur.next;
           cur.next=pre;
            cur=temp;
        }
        return pre;
    }
}
