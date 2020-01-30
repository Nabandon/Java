package Test;

public class FindListNodeK {
    private ListNode findK(ListNode head,int k){
        ListNode a=head;
        ListNode b=head;
        if(head==null||k<=0){
            return null;
        }
        for(int i=0;i<k;i++){
            if(b==null){
                return null;
            }
            b=b.next;
        }
        while (b!=null){
                a=a.next;
                b=b.next;
        }
        return a;
    }
}
