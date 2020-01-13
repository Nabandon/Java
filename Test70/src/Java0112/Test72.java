package Java0112;

public class Test72 {
    public static void main(String[] args) {
        int x=20;
        int y=5;
        System.out.println(x+y+""+(x+y)+y);
    }
    class Suloution{
        public String toLworCase(String str){
                String st="";
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
               if(c>=65&&c<=90){
                   c+=32;
               }
               st+=c;
            }
            return st;
        }
    }
    public ListNode partition(ListNode pHead, int x){
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode cur=pHead;
        ListNode aHead=new ListNode(-1);
        ListNode bHead=new ListNode(-1);
        ListNode a=aHead;
        ListNode b=bHead;
        while(cur!=null){
            if(cur.val<=x){
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
