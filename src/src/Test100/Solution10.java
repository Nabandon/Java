package Test100;

public class Solution10 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode node=new ListNode(0);
        node.next=head;
        ListNode cur=node;
        while(head!=null&&head.next!=null){
            if(head.next!=null&&head.val==head.next.val){
                while(head.next!=null&&head.val==head.next.val){
                    head=head.next;
                }
                cur.next=head.next;
            }else{
                cur=head;
            }
            head=head.next;
        }
        return node.next;
    }
}
