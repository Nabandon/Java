package Solution007;

import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(sca.hasNext()){
            list.add(sca.nextInt());
        }
        int len=list.size();
        if(len<1){
            return;
        }
        int k=list.get(len-1);

        ListNode head=new ListNode(0);
        ListNode cur=head;
        for(int i=k-1;i<len-1;i+=k){
            for(int j=i;j>i-k;j--){
                cur.next=new ListNode(list.get(j));
                cur=cur.next;
            }
        }
        int c=(len-1)/k;
        int qishi=c*k;
        for(;qishi<len-1;qishi++){
            cur.next=new ListNode(list.get(qishi));
            cur=cur.next;
        }
        while(head.next!=null){
            System.out.print(head.next.val+" ");
            head=head.next;
        }
    }
} 