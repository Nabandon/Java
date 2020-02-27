package Test100;

public class K {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k==0) return null;
        ListNode pre=head;
        ListNode cur=head;
        for(int i=0;i<k;i++){
            if(cur==null) return null;
            cur=cur.next;
        }
        while (cur!=null){
            pre=pre.next;
            cur=cur.next;
        }
        return pre;
    }
}
