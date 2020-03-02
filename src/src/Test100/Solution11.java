package Test100;

public class Solution11 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode cur=head;
        ListNode pre=head;
        while(cur!=null&&cur.next!=null){
            if(cur.next!=null&&cur.val==cur.next.val){
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                pre.next=cur.next;
                pre=pre.next;
            }else{
                pre=cur;
                pre=pre.next;
            }
            cur=cur.next;
        }
        return head;
    }
}
