package Test;

public class HasCycle {
    private boolean hasCycle(ListNode head){
        if(head==null||head.next==null){
            return false;
        }
        ListNode pre=head;
        ListNode cur=head.next;
        while(pre!=cur){
            if(cur==null||cur.next==null){
                return false;
            }
           pre=pre.next;
           cur=cur.next.next;
        }
        return true;
    }
}