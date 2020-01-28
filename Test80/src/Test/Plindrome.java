package Test;

public class Plindrome {
    public boolean plindrome(ListNode A){
        ListNode B=reverseList(A);
        while(A!=null){
            if(A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }
        return true;
    }
    private ListNode reverseList(ListNode A){
        if(A==null){
            return null;
        }
        ListNode newA=new ListNode(0);
        newA.next=null;
        ListNode temp=null;
        while(A.next!=null){
            temp=new ListNode(A.next.val);
            temp.next=newA;
            newA=temp;
            A=A.next;
        }
        return newA;
    }
}
