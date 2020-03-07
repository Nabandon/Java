package Test101;

public class E{
    public ListNode findK(ListNode head,int k){
        if(head==null||k==0) return null;
        ListNode pre=head;
        ListNode cur=head;
        for(int i=0;i<k;i++){
            if(cur==null) return null;
            cur=cur.next;
        }
       while(cur!=null){
           cur=cur.next;
           pre=pre.next;
        }
        return pre;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode head=new ListNode(0);
        ListNode newhead=head;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                newhead.next=new ListNode(l1.val);
                newhead=newhead.next;
                l1=l1.next;
            }else{
                newhead.next=new ListNode(l2.val);
                newhead=newhead.next;
                l2=l2.next;
            }
        }
        newhead.next= l1==null?l2:l1;
        return head.next;
    }
}
