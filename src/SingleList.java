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
     * 新创建的一个 m+n 个节点的链表    并非原到合并
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
        cur.next = headA != null ? headA : headB;
        return newHead.next;
    }

    /**
     * 原地合并两个排序链表  不new节点
     * 递归
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

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
