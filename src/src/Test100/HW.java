package Test100;

public class HW {
    public boolean chkPalindrome(ListNode A) {
        if(A==null||A.next==null) return true;
        ListNode a=A;
        ListNode b=A;
        while (b!=null&&b.next!=null){
            a=a.next;
            b=b.next.next;
        }
        ListNode pre=null;
        ListNode cur=a;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        while (pre!=null) {
            if(A.val!=pre.val){
                return false;
            }
            A=A.next;
            pre=pre.next;
        }
        return true;
    }
}
