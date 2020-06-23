package src.Test100;
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Area {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead==null || pHead.next==null){
            return pHead;
        }
        ListNode qx=new ListNode(0);
        ListNode dx=new ListNode(0);
        ListNode pre=qx;
        ListNode cur=dx;
        ListNode j=null;
        while(pHead!=null){
            if(pHead.val<x){
                pre.next=new ListNode(pHead.val);
                j=pre.next;
                pHead=pHead.next;
                pre=pre.next;
            }else{
                cur.next=new ListNode(pHead.val);
                pHead=pHead.next;
                cur=cur.next;
            }
        }
        if(j!=null){
            j.next=dx.next;
            return qx.next;
        }else{
            return dx.next;
        }
    }
}
