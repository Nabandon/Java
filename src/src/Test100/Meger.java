package Test100;

public class Meger {
    public ListNode mergeKLists(ListNode[] lists) {
        int min=Integer.MAX_VALUE;
        int n=-1;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null&&lists[i].val<min){
                min=lists[i].val;
                n=i;
            }
        }
        if(n==-1) return null;
        ListNode node=lists[n];
        lists[n]=lists[n].next;
        node.next=mergeKLists(lists);
        return node;
    }
}
