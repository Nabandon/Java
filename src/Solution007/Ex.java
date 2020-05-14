package Solution007;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public  class Ex {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode mideNext=mid.next;
        mid.next=null;
        return merge(sortList(head),sortList(mideNext));
    }
    private ListNode merge(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode head=new ListNode(0);
        ListNode cur=head;
       if(l1.val<l2.val){
           cur=l1;
           l1=l1.next;
       }else {
           cur=l2;
           l2=l2.next;
       }
        while(l1!=null || l2!=null){
            if(l1==null){
                cur.next=l2;
                return head;
            }else if(l2==null){
                cur.next=l1;
                return head;
            }else if(l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
                cur=cur.next;
            }else{
                cur.next=l2;
                l2=l2.next;
                cur=cur.next;
            }

        }
        return head;
    }
    private ListNode getMid(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur=head;
        while(cur.next!=null && cur.next.next!=null ){
            head=head.next;
            cur=cur.next.next;
        }
        return head;
    }
}
