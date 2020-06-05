import java.util.List;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class SingleList {

    /**
     * 反转单链表
     *
     * 三个指针维护单链表
     * prev 表示将要反转的节点的前驱
     * cur  表示将要反转的节点
     * curNext 表示将要反转节点的下一个节点
     *
     *
     * 当 cur 指向 null 的时候表示所有节点都已反转，而此时的 prev（前驱） 指向未反转前的最后一个节点
     * 即 prev 此时指向的就是反转后新的单链表的头节点
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
    public static void show(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val +" ");
            cur = cur.next;
        }
    }

    /**
     * 合并两个排序链表
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode mergeTwoList(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while (headA != null && headB != null) {
            if (headA.val < headB.val) {
                cur.next = headA;
                headA = headA.next;
            }else {
                cur.next = headB;
                headB = headB.next;
            }
            cur = cur.next;
        }
        if (headA != null) {
            cur.next = headA;
        }else {
            cur.next = headB;
        }
        return newHead.next;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        show(a);
        System.out.println();
        ListNode newHead = reverseList(a);
        show(newHead);
    }
}
