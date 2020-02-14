package Test90;

public class Part {
    public ListNode partition(ListNode pHead, int x) {

        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode cur=pHead;
        ListNode qhead=new ListNode(0);
        ListNode hhead=new ListNode(0);
        ListNode q=qhead;
        ListNode h=hhead;
        while(cur!=null){
            if(cur.val<x){
                q.next=new ListNode(cur.val);
                q=q.next;
            }else{
                h.next=new ListNode(cur.val);
                h=h.next;
            }
            cur=cur.next;
        }
        cur=qhead;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=hhead.next;
        return qhead.next;
    }
}
