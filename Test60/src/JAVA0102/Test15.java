package JAVA0102;
class Node{
    public  int data;
    public Node next=null;
    public Node(int data){
        this.data=data;
    }
}
public class Test15 {
    private Node head=null;
    public void addFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public void addLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return ;
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=node;
    }
    public void display(int data){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.println(cur.data+" ");
        }
    }
    public int getSize(){
        int size=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }

}
