package Test222;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        ListNode arr=new ListNode(0);


    }

    public int[] reversePrint(ListNode head) {
        int size=0;
        for(ListNode c=head;c!=null;c=c.next){
            size++;
        }
        int[] arr=new int[size];
        for(int i=size-1;i>=0;i--){
            arr[i]=head.val;
            head=head.next;
        }
        return arr;
    }
}
