package Test100;

public class HasCycle1 {
    public boolean hasCycle(ListNode head){
        ListNode a=head;
        ListNode b=head;
            while (b!=null&&b.next!=null){
                a=a.next;
                b=b.next.next;
                if(a!=b){
                    return true;
                }
            }
        return false;
    }
}
