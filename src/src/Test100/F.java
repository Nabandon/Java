package Test100;

public class F {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode tempNext=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tempNext;
        }
        return pre;
    }
}
