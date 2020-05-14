package Solution007;

import java.util.Stack;

public class Solution01 {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur=new ListNode(0);
        ListNode t=head;

        while(t!=null){
            ListNode tNext=t.next;
            ListNode pre=cur;
            while(pre.next!=null && pre.next.val<t.val){
                pre=pre.next;
            }
            t.next=pre.next;
            pre.next=t;
            t=tNext;
        }
        return  cur.next;
    }
}