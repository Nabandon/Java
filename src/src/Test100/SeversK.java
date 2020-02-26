package Test100;

public class SeversK {
    public ListNode sk(ListNode head,int k){
        if(head==null||head.next==null||k==1)  return head;
        ListNode arr=new ListNode(-1);
        arr.next=head;
        ListNode left=arr;
        ListNode right=arr;
        while (right.next!=null) {
            for (int i = 0; i < k&&right!=null; i++) {
                right = right.next;
            }
            if(right==null) break;
           ListNode r=right.next;
           ListNode l=left.next;
            right.next = null;
            left.next = servers(l);
            l.next=r;
            left=l;
            right=left;
        }
        return arr.next;
    }
    private ListNode servers(ListNode h){
        ListNode pre=null;
        ListNode start=h;
        while(start!=null){
            ListNode temp=start.next;
            start.next=pre;
            pre=start;
            start=temp;
        }
        return pre;
    }
}
