package Test100;

public class Swap {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)  return head;
        ListNode arr=new ListNode(0);
        arr.next=head;
        ListNode slow=arr;
        ListNode pre=arr;
        ListNode fast=arr;
        slow=slow.next;
        fast=fast.next.next;
        pre.next=fast;
        pre=pre.next;
        pre.next=slow;
        pre=pre.next;
        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next.next;
           pre.next=fast;
            pre=pre.next;
            pre.next=slow;
        }
        return arr.next;
    }
}
