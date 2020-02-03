package Test;

public class DeleteRepeat {
    public ListNode deleteRepeat(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode Head2=new ListNode(Integer.MIN_VALUE);
       Head2.next=pHead;
       ListNode pre=Head2;
       ListNode cur=Head2.next;
       while(cur!=null){
           if(cur.next!=null&&cur.val==cur.next.val){
               while(cur.next!=null&&cur.val==cur.next.val){
                   cur=cur.next;
               }
               cur=cur.next;
               pre.next=cur;
           }else{
            pre=cur;
            cur=cur.next;
           }
       }
       return Head2.next;
    }
}
