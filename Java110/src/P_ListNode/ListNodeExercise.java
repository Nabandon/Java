package P_ListNode;

public class ListNodeExercise {
    private ListNode delete(ListNode head, int vals) {
        ListNode h = new ListNode();
        h.next = head;
        while (head != null) {
            if (head.val == vals) {
                h.next = head.next;
            }
            head = head.next;
        }
        return h.next;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null;
        while (slow != null) {
            ListNode tem = slow.next;
            slow.next = pre;
            pre = slow;
            slow = tem;
        }
        while (pre != null) {
            if (pre.val != head.val) {
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = new ListNode();
        cur.next = head;
        ListNode pre = cur;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return cur.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode();
        ListNode pre = cur;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        pre.next = l1 == null ? l2 : l1;
        return cur.next;
    }

    public ListNode partition(ListNode pHead, int x) {
        ListNode small = new ListNode();
        ListNode big = new ListNode();
        ListNode s = small;
        ListNode b = big;
        while (pHead != null) {
            if (pHead.val < x) {
                s.next = pHead;
                s = s.next;
            } else {
                b.next = pHead;
                b = b.next;
            }
            pHead = pHead.next;
        }
        s.next = big.next;
        return small.next;
    }
    //删除该链表中重复的结点，重复的结点不保留
    public ListNode deleteDuplication(ListNode pHead){
        ListNode cur=new ListNode();
        cur.next=pHead;
        ListNode pre=cur;
        ListNode head=pHead;
        while(head!=null){
            if(head.next!=null&& head.next.val==head.val){
                while(head.next!=null&& head.next.val==head.val){
                    head=head.next;
                }
                pre.next=head.next;
                head=head.next;
            }else{
                pre=head;
                head=head.next;
            }
        }
        return cur.next;
    }

}
