package Test100;

public class Solution119 {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null||head.next==null) return head;
        int size=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            size++;
        }
        int step=k%size;
        if(step==0) return head;
        ListNode pre1=new ListNode(0);
        pre1=head;
        ListNode pre=pre1;
        for(int i=0;i<size-step-1;i++){
            pre=pre.next;
        }
        ListNode cur=pre.next;
        pre.next=null;
        ListNode cur2=cur;
        while(cur2.next!=null){
            cur2=cur2.next;
        }
        cur2.next=pre1;
        return cur;
    }
}
