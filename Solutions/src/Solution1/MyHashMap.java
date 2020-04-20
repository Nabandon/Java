package Solution1;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.HashSet;

//
public class MyHashMap {
    class Node {
        int key;
        int value;
        Node next = null;

        public  Node(int key, int value) {
                this.key=key;
                this.value=value;
        }
    }
    private Node[] arr=new Node[1001];
    private  int size=0;
    private final double LENGTH=0.75;
    private int HashFunc(int key){
        return key%arr.length;
    }
    public void put(int key,int value){
        int index= HashFunc(key);
        Node cur=arr[index];
        for(Node pre=cur;pre!=null;pre=pre.next){
            if(pre.key==key){
                pre.value=value;
                return;
            }
        }
        Node newNode=new Node(key,value);
        newNode.next=cur;
        arr[index]=newNode;
        size++;
        if(size/arr.length>LENGTH){
            resize();
        }
    }
    private void resize(){
        Node[] newArr=new Node[arr.length*2];
        for(int i=0;i<arr.length;i++){
            for(Node cur=arr[i];cur!=null;cur=cur.next){
                int index=cur.key%newArr.length;
                Node newNode=new Node(cur.key,cur.value);
                newNode.next=newArr[index];
                newArr[index]=newNode;
            }
        }
        arr=newArr;
    }
    public Integer get(int key){
        int index=HashFunc(key);
        Node list=arr[index];
        for(Node cur=list;cur!=null;cur=cur.next){
            if(cur.key==key){
                return  cur.value;
            }
        }
        return -1;
    }
    public void remove(int key) {
        int index=HashFunc(key);
        Node list=arr[index];
        if(list!=null){
            if(list.key==key){
                arr[index]=list.next;
            }else {
                for(;list!=null&&list.next!=null;list=list.next){
                    if(list.next.key==key){
                        list.next=list.next.next;
                    }
                }
            }
        }
    }
}

//
class MyHashSet {
class Node{
    int key;
    Node next=null;
    public Node(int key){
        this.key=key;
    }
}
    /** Initialize your data structure here. */
    public MyHashSet() {

    }
    private final double L=0.75;
 private  Node[] arr=new Node[1001];
   private int size=0;
    private int findKey(int key){
        return key%arr.length;
    }
    public void add(int key) {
        int index=findKey(key);
        Node cur=arr[index];
        for (Node pre=cur;pre!=null;pre=pre.next){
            if(pre.key==key){
                return;
            }
        }
        Node newCur=new Node(key);
        newCur.next=cur;
        arr[index]=newCur;
        size++;
        if(size/arr.length>L){
            resize();
        }
    }
    private void resize(){
        Node[] newArr=new Node[arr.length*2];
        for(int i=0;i<arr.length;i++){
            for(Node pre=arr[i];pre!=null;pre=pre.next){
                int index=pre.key/newArr.length;
                Node newNode=new Node(pre.key);
                newNode.next=newArr[index];
                newArr[index]=newNode;
            }
        }
        arr=newArr;
    }

    public void remove(int key) {
        int index=findKey(key);
        Node cur=arr[index];
        if(cur.key==key){
            arr[index]=cur.next;
        }else {
            for (Node pre=cur;pre.next!=null;pre=pre.next){
                if(pre.next.key==key){
                    pre.next=pre.next.next;
                }
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
            int index=findKey(key);
            Node cur=arr[index];
            for(;cur!=null;cur=cur.next){
                if(cur.key==key){
                    return true;
                }
            }
            return false;
    }
}
