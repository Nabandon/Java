package Test100;

public class S2 {
    public ListNode swap(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        first=swap(second.next);
        second.next=first;
        return second;
    }
}
