package Test100;

public class Solution {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead==null||pHead.next==null) return pHead;
        ListNode cur=pHead;
        ListNode big=new ListNode(0);
        ListNode bigt=big;
        ListNode small=new ListNode( 0);
        ListNode smallt=small;
        while(cur!=null){
            if(cur.val<x){
                bigt.next=new ListNode(cur.val);
                bigt=bigt.next;
            }else {
                smallt.next=new ListNode(cur.val);
                smallt=smallt.next;
            }
            cur=cur.next;
        }
        bigt.next=small.next;
        return big.next;
    }
}
