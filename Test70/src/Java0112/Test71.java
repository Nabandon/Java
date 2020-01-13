package Java0112;
class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }
}
public class Test71 {

    public ListNode FindKthToTail(ListNode head,int k) {
      if(head==null){
        return null;
      }
      int size=getSize(head);
      if(k<0||k>size){
        return null;
      }
      int offset=size-k;
      ListNode cur=head;
      for(int i=0;i<offset;i++){
        cur=cur.next;
      }
      return cur;
    }
    private int getSize(ListNode head){
      int size=0;
      for(ListNode cur=head;cur!=null;cur=cur.next){
        size++;
      }return size;
    }

  }

