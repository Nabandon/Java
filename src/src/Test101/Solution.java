package Test101;

public class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return ;
        ListNode slow=head;
        ListNode fast=head;
        ListNode  mo=null;
        while(fast!=null&&fast.next!=null){
            mo=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        mo.next=null;
        ListNode cur=slow;
        ListNode pre=null;
        while(cur!=null){
            ListNode nexttemp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nexttemp;
        }
        ListNode curr=new ListNode (0);
        curr.next=head;
        ListNode list=curr;
        while(head!=null&&pre!=null){
            list.next=head;
            head=head.next;
            list.next.next=pre;
            list=pre;
            pre=pre.next;

        }
        if(pre!=null){
            list.next=pre;
        }
        head=curr.next;
    }
}
