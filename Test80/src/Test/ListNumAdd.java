package Test;

public class ListNumAdd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode h0=l3;
        ListNode h1=l1;
        ListNode h2=l2;
        int carry=0;
        while(h1!=null||h2!=null){
            int x= h1==null?0:h1.val;
            int y= h2==null?0:h2.val;
            int sum=carry+x+y;
            carry=sum/10;
            h0.next=new ListNode(sum%10);
            h0=h0.next;
            if(h1!=null) h1=h1.next;
            if(h2!=null) h2=h2.next;
        }
        if(carry>0){
            h0.next=new ListNode(carry);
        }
        return l3.next;
    }
}
