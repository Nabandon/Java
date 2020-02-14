package Test2;

public class MidileNode {
    public ListNode midNode(ListNode head){
        int size=getsize(head);
        int step=size/2;
        ListNode cur=head;
     for(int i=0;i<step;i++){
         cur=cur.next;
     }
     return cur;
    }
    private int getsize(ListNode head){
        ListNode cur=head;
        int size=0;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }

}
