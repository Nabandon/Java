package Solution1;

import Solution2.TreeNode;

import java.util.*;


public class Java_0402 {
    public static void main(String[] args) {
    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        Node node=head;
        Map<Node,Node> map=new HashMap<>();
        while(node!=null){
            Node clone=new Node(node.val);
            map.put(node,clone);
            node=node.next;
        }
        node =head;
        while(node!=null){
            map.get(node).next=map.get(node.next);
            map.get(node).random=map.get(node.random);
            node=node.next;
        }
        return map.get(head);
    }

}
