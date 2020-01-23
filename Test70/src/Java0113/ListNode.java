package Java0113;

public class ListNode {
    ListNode next;
    int val;
    ListNode(int x) {
        val = x;
    }
}
class Solution{
    public ListNode reverseList(ListNode head) {
       ListNode pre=null;
       ListNode cur=head;
       while(cur!=null){
           ListNode nxetTmp=cur.next;
           cur.next=pre;
           pre=cur;
           cur=nxetTmp;
       }return pre;
    }
}
