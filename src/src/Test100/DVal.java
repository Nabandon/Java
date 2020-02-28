package Test100;

public class DVal {
    public ListNode deleteVal(ListNode head,int val){
        ListNode node=new ListNode( 0);
        node.next=head;
        ListNode pre=node;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else {
                pre=cur;
            }
           cur=cur.next;
        }
        return node.next;
    }
    public ListNode cf(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode node=new ListNode( 0);
        node.next=head;
        ListNode pre=node;
        ListNode cur=head;
        while (cur!=null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                pre.next=cur;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        return node.next;
    }

}
