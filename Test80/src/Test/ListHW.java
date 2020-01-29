package Test;

public class ListHW {
    public boolean chkPalindrome(ListNode A) {
        ListNode B=servese(A);
        while (A!=null){
            if(A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }
        return true;
    }
    public ListNode servese(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
