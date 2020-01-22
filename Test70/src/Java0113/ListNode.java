package Java0113;

public class ListNode {
    ListNode next;
    int val;
    ListNode(int x) {
        val = x;
    }
}
class Solution{
    public ListNode removeElements(ListNode head, int val) {
        ListNode node=new ListNode(-1);
        node.next=head;
        ListNode cur=node;
        while(cur.next!=null){
           if(cur.next.val==val){
               cur.next=cur.next.next;
           }else {
               cur=cur.next;
           }
        }
        return node.next;
    }
}
