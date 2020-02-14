package Test2;



public class DeletVal {
    public ListNode deletVal(ListNode head,int val){
        ListNode node=new   ListNode(-1);
        node.next=head;
        ListNode curr=node;
        while(curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return node.next;
    }

}
