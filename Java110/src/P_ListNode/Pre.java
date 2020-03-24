package P_ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Pre {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode pre=null;
        ListNode head=listNode;
        while(head!=null){
            ListNode temp=head.next;
            head.next=pre;
            pre=head;
            head=temp;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(pre!=null){
            list.add(pre.val);
            pre=pre.next;
        }
        return list;
    }
}
