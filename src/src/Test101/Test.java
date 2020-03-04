package Test101;

public class Test {
    public ListNode x(ListNode head){
        if(head==null|head.next==null) return null;
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
    public ListNode mid(ListNode head){
        if(head==null||head.next==null) return head;
        int size=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            size++;
        }
        ListNode pre=head;
        for(int i=0;i<size/2;i++){
            pre=pre.next;
        }
        return pre;
    }
}