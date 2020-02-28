package Test100;

public class D {
    public ListNode d(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
                ListNode next=cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
        }
        return pre;
    }
    private ListNode e(ListNode head){
        ListNode pre=head;
        ListNode cur=head;
        while(cur!=null&&cur.next!=null){
            pre=pre.next;
            cur=cur.next.next;
        }
        return pre;
    }
    private ListNode f(ListNode head,int k){
            ListNode pre=head;
        ListNode cur=head;
        for(int i=0;i<k;i++){
            if(cur==null)  return null;
            cur=cur.next;
        }
        while (cur!=null){
            pre=pre.next;
            cur=cur.next;
        }
        return pre;
    }
    private ListNode g(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode node=new ListNode(0);
        ListNode pre=node;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                pre.next=l1;
                pre=pre.next;
                l1=l1.next;
            }else {
                pre.next=l2;
                pre=pre.next;
                l2=l2.next;
            }
        }
        pre.next= l1==null?l2:l1;
        return pre;
    }
    public  ListNode d(ListNode head,int val){
        ListNode node=new ListNode( 0);
        node.next=head;
        ListNode pre=node;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else{
                pre=cur;
            }
            cur=cur.next;
        }
        return node.next;
    }

}
