package Test101;

public class Solution12 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
        ListNode cur=head;
        ListNode pre=head;
        ListNode node=new ListNode(0);
        node.next=head;
        ListNode node1=node;
        for(int i=0;i<m-1;i++){
            node1=node1.next;
            pre=pre.next;
        }
        for(int j=0;j<n-1;j++){
            cur=cur.next;
        }
        ListNode after=cur.next;
        ListNode befor=pre;
        ListNode nul=null;
        while(pre!=after){
            ListNode temp=pre.next;
            pre.next=nul;
            nul=pre;
            pre=temp;
        }
        node1.next=nul;
        befor.next=after;
        return  node.next;
    }
}
