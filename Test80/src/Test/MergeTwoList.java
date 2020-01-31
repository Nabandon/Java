package Test;

public class MergeTwoList {
    private ListNode mergeTwo(ListNode A1,ListNode A2){
        ListNode A=new ListNode(0);
        ListNode cur=A;
        while (A1!=null&&A2!=null){
            if(A1.val<=A2.val){
                cur.next=A1;
                A1=A1.next;
            }else {
                cur.next=A2;
                A2=A2.next;
            }
            cur=cur.next;
        }
        cur.next= A1==null?A2:A1;
        return A.next;
    }

}
