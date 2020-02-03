package Test;

public class GetIntersectionNode {
    public ListNode getIntersectionList(ListNode head1,ListNode head2){
        ListNode h1=head1;
        ListNode h2=head2;
        while(h1!=h2){
            h1= h1==null?head2:h1.next;
            h2= h2==null?head1:h2.next;
        }
        return h1;
    }
}
