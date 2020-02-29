package Test100;

public class huiwen {
    public boolean chkPalindrome(ListNode A) {
        ListNode slwo=A;
        ListNode fast=A;
        while (fast!=null&&fast.next!=null){
            slwo=slwo.next;
            fast=fast.next.next;
        }
        ListNode B=null;

        while (slwo!=null){
            ListNode temp=slwo.next;
            slwo.next=B;
            B=slwo;
            slwo=temp;
        }
        while (B!=null){
            if(A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }
        return true;
    }
}
