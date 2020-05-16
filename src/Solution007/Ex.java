package Solution007;


import java.util.HashMap;
import java.util.Map;

public  class Ex {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null){
            return null;
        }
        Map<RandomListNode,RandomListNode> map=new HashMap<>();
        RandomListNode colne=head;
        RandomListNode n=colne;
        while(n!=null){
            RandomListNode c=new RandomListNode(n.label);
            map.put(n,c);
            n=n.next;
        }
        n=colne;
        while(n!=null){
            map.get(n).next=map.get(n.next);
            map.get(n).random=map.get(n.random);
            n=n.next;
        }
        return colne;
    }
}
