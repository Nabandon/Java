package Test100;

public class Intersection {
    public ListNode getIntersection(ListNode A,ListNode B){
        ListNode a=A;
        ListNode b=B;
        while(a!=b){
            a= a==null? B:a.next;
            b= b==null? A:b.next;
        }
        return a;
    }
}
