package Test;

public class TestList{
public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        int s=GetSize(head);
        if(k<0||k>s){
            return null;
        }
        ListNode cur=head;
        for(int i=0;i<s-k;i++){
            cur=cur.next;
        }return cur;
   }
   private int GetSize(ListNode head){
    int size=0;
    for(ListNode cur=head;cur!=null;cur=cur.next){
        size++;
    }
    return size;
   }

}