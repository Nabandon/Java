package Solution007;

import java.util.Stack;

public class Solution01 {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode end=null;
        while(slow!=null){
            ListNode t=slow.next;
            slow.next=end;
            end=slow;
            slow=t;
        }
        ListNode first=head;
        while(end!=null && first!=null){
            ListNode q=first.next;
            ListNode h=end.next;
            first.next=end;
            first=q;
            end.next=q;
            end=h;
        }
    }
}