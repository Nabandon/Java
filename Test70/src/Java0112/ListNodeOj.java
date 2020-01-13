package Java0112;
class listNode{
    int val;
    listNode next;
    public listNode (int x){
        val=x;
    }
}
public class ListNodeOj {
    public listNode mergeTwoList(listNode l1,listNode l2){
        listNode node=new listNode(-1);
                listNode pre=node;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                pre.next=l1;
                l1= l1.next;
            }else {
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        pre.next=l1==null?l2:l1;
        return node.next;
    }
}
