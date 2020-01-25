package Test;

class Test82 {

    public ListNode middleNode(ListNode head){
        int step=getSize(head)/2;
        ListNode cur=head;
        for(int i=0;i<step;i++){
            cur=cur.next    ;
        }return cur;
    }
    private int getSize(ListNode head){
        ListNode cur=head;
        int size=0;
        for(cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
}
