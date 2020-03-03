package Test101;

public class Solution1 {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode node=new ListNode (0);
        node.next=head;
        ListNode pre=node;
        ListNode cur;
        while(head.next!=null){
            cur=head.next;
            if(head.val>cur.val){
                while(pre.next!=null&pre.next.val<cur.val){
                    pre=pre.next;
                }
                head.next=cur.next;
                cur.next=pre.next;
                pre.next=cur;
                pre=node;
            }else{
                head=cur;
            }
        }
        return node.next;
    }
}
