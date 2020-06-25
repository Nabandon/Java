package Test90;

import java.util.Stack;

public class Part {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode res=new ListNode(0);
        ListNode pre=res;
        int n=0;
        while(a!=null && b!=null){
            int  sum=a.val+b.val+n;
            if(sum>9){
                n=1;
                sum-=10;
                pre.next=new ListNode(sum);
            }else{
                n=0;
                pre.next=new ListNode(sum);
            }
            pre=pre.next;
            a=a.next;
            b=b.next;
        }

        while(a!=null){
            int  sum=a.val+n;
            if(sum>9){
                n=1;
                sum-=10;

            }else{
                n=0;
            }
            pre.next=new ListNode(sum);
            pre=pre.next;
            a=a.next;
        }
        while(b!=null){
            int  sum=b.val+n;
            if(sum>9){
                n=1;
                sum-=10;

            }else{
                n=0;
            }
            pre.next=new ListNode(sum);
            pre=pre.next;
            b=b.next;
        }
        if(n==1){
            pre.next=new ListNode(1);
            return res.next;
        }else{
            return res.next;
        }
    }
}
