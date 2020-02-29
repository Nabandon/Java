package Test100;

public class Test110 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int Asize=size(headA);
        int Bsize=size(headB);
        if(Asize>Bsize){
            int step=Asize-Bsize;
            for(int i=0;i<step;i++){
                headA=headA.next;
            }
        }else {
            int step2=Bsize-Asize;
            for(int i=0;i<step2;i++){
                headB=headB.next;
            }
        }
        while (headA!=null&&headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    private int size(ListNode head){
        int size=0;
        while (head!=null){
            head=head.next;
            size++;
        }
        return size;
    }
}
