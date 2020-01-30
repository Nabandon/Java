package Test;

public class MiddleNode {
    private ListNode middle_node(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        while (b.next!=null&&b!=null){
            a=a.next;
            b=b.next.next;
        }
        return a;
    }
}
