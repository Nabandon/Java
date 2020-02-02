package Test;

public class Detect_Cycle {
    private ListNode detectCycle(ListNode head){
        if(head==null){
            return null;
        }
        ListNode cur=head;
        ListNode inter=getIntersecte(head);
        if(inter==null){
            return null;
        }
        while(inter!=cur){
            inter=inter.next;
            cur=cur.next;
        }
        return cur;
    }
    private ListNode getIntersecte(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return fast;
            }
        }
        return null;
    }
}
