package Solution1;

import java.util.HashSet;

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
    private Node[] arr=new Node[101];
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
        return null;
    }
}
