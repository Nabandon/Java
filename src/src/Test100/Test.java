package Test100;

public class Test {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode arr=new ListNode(0);
                 arr.next=head;
        ListNode fast=arr;
        ListNode pre=arr;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            pre=pre.next;
        }
        pre=pre.next.next;
        return arr.next;
    }
}
