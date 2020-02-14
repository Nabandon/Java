package Test2;

public class K {
    public ListNode k(ListNode head,int k){
        if(head==null||k==0) return null;
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<k;i++){
            if(fast==null){
                return null;
            }else {
                fast=fast.next;
            }
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
