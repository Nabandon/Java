package Test;

public class PalindromeListNode {
   public boolean palindrom(ListNode A) {
        ListNode b=reverseList(A);
        while(A!=null){
            if(A.val!=b.val){
                return false;
            }
            A=A.next;
            b=b.next;
        }
        return true;
    }
    private ListNode reverseList(ListNode head){
       if(head==null){
           return null;
       }
       ListNode nHead=new ListNode(head.val);
       nHead=null;
       ListNode cur=head;
       while (cur!=null){
           ListNode temp=cur.next;
           cur.next=nHead;
           nHead=cur;
           cur=temp;
       }
       return nHead;
    }
}
