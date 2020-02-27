package Test100;

public class Z {
    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null) return head;
        int step=size(head)/2;
        for(int i=0;i<step;i++){
            head=head.next;
        }
        return head;
    }
    private int size(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}
