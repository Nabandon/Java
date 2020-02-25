package Test100;

public class S3 {
    public ListNode swapPairs(ListNode head) {
        ListNode node=new ListNode(-1);
        node.next=head;
        ListNode pre=node;
        while(head!=null&&head.next!=null){
            ListNode firt=head;
            ListNode second=head.next;
            pre.next=second;
            firt.next=second.next;
            second.next=firt;
            pre=firt;
            head=firt.next;
        }
        return node.next;
    }
}
