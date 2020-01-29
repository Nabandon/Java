package Test;

public class ListPalindrome {
    public boolean chkPalindrome(ListNode A){
        ListNode B=reverseList(A);
        while(A!=null){
            if(A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }return true;
    }
    private ListNode reverseList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode newHead=new ListNode(head.val);
        newHead.next=null;
        ListNode temp=null;
        while (head.next!=null){
            temp=new ListNode(head.next.val);
            temp.next=newHead;
                newHead=temp;
                head=head.next;
        }
        return newHead;
    }
}
