package Test100;

public class PalindromeList {
    public boolean palindrome(ListNode A){
        ListNode B=reverse(A);
        while(A!=null){
            if(A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }
        return true;
    }
    private ListNode reverse(ListNode A){
        if(A==null||A.next==null){
            return A;
        }
        ListNode na=new ListNode(0);
        ListNode pre=A;
         na=null;
        while(pre!=null){
            ListNode temp=pre.next;
            pre.next=na;
            na=pre;
            pre=temp;
        }
        return na;
    }
}
