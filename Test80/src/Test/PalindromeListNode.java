package Test;

public class PalindromeListNode {
    private boolean palindrom(ListNode A){
        ListNode L1=A;
        ListNode L2=reverse(A);
        while(L1!=null){
            if(L1.val!=L2.val){
                return false;
            }
            L1=L1.next;
            L2=L2.next;
        }return true;
    }
    private ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
