package Test;

public class DetectCycle {
    private    ListNode  getIntersecte(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null||fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head){
        if(head==null){
            return null;
        }
        ListNode intersecte=getIntersecte(head);
            if(intersecte==null){
                return null;
            }
            ListNode p1=head;
            while(p1!=intersecte){
                p1=p1.next;
                intersecte=intersecte.next;
            }
            return p1;
    }
}
