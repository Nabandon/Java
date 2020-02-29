package Test100;

public class Main {
    public  ListNode listRestructuring(int n, ListNode head) {
        if (head == null || n >= 0 && n <= 3) return head;
        int step = n / 2;
        ListNode left = head;
        ListNode pre = head;
        for (int i = 0; i < step - 1; i++) {
            pre = pre.next;
        }
        ListNode right = pre.next;
        pre = null;

        ListNode head_new = new  ListNode(0);
        head_new = left;
        ListNode list2 = head_new;
        while (left != null) {
            list2.next = right;
            list2 = list2.next;
            right = right.next;
            left = left.next;
            list2.next = left;
            list2 = list2.next;
        }
        list2.next = right;
        return head_new;
    }
}
