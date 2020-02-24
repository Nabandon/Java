package Test100;

public class Test1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode arr=new ListNode(0);
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val) {
                arr.next = l1;
                l1 = l1.next;
                arr=arr.next;
            }else {
                arr.next=l2;
                l2=l2.next;
                arr=arr.next;
            }
        }
        arr.next= l1==null? l2:l1;
        return arr.next;
    }
}
