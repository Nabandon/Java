package Test;

public class Sloution {

        public ListNode partition(ListNode pHead, int x) {
            // write code here
            if(pHead==null||pHead.next==null){
                return pHead;
            }
            ListNode cur=pHead;
            ListNode aHead=new ListNode(-1);
            ListNode bHead=new ListNode(-1);
            ListNode a=aHead;
            ListNode b=bHead;
            while(cur!=null){
                if(cur.val<x){
                    a.next=new ListNode(cur.val);
                    a=a.next;
                }else {
                    b.next=new ListNode(cur.val);
                    b=b.next;
                }
                cur=cur.next;
            }
            cur=aHead;
            while(cur.next!=null&&cur.next.val!=-1){
                cur=cur.next;
            }
            cur.next=bHead.next;
            return aHead.next;
        }
    }

