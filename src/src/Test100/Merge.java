package Test100;

public class Merge {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode node =new ListNode(0);
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
        return node.next;
    }
}
