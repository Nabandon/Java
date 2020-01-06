package JAVA0102;

import org.omg.CORBA.DATA_CONVERSION;

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
    public boolean addIndex(int index,int data){
        int size=getSize();
        if(index<0||index>size){
            return false;
        }
        if(index==0){
            addFirst(data);
            return true;
        }
        if(index==size){
            addLast(data);
            return true;
        }
       Node node=new Node(data);
        Node prev=getPos(index-1);
        node.next=prev.next;
        prev.next=node;
        return true;
    }
    private Node getPos(int index){
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
}
