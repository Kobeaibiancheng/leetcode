package list;

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 *
 *
 * 快慢指针
 */
public class KthToLast {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public int kthToLast(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(k > 0){
            p1 = p1.next;
            k--;
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.val;
    }
}
