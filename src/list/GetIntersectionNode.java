package list;


/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 */
public class GetIntersectionNode {

    /**
     * 暴力解法
     * 如果是有交点的，那么两个链表后面的公共链表长度是一样的，那么只要将非公共的链表指针同时next，就可以找到第一个公共节点
     * 所以先遍历两个链表的长度
     * 然后让长的链表先走两个链表长度的差额，然后同时next，指针相同，代表是第一个公共节点，直到null，表示没有交点
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        ListNode p = headA;
        while(p != null){
            p = p.next;
            a++;
        }
        p = headB;
        while(p != null){
            p = p.next;
            b++;
        }
        if(a > b){
            ListNode p1 = headA;
            ListNode p2 = headB;
            int gap = a-b;
            while(gap > 0){
                p1 = p1.next;
                gap--;
            }
            while(p1 != p2){
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }else if(a <= b){
            ListNode p1 = headA;
            ListNode p2 = headB;
            int gap = b-a;
            while(gap > 0){
                p2 = p2.next;
                gap--;
            }
            while(p1 != p2){
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }else{
            return null;
        }

    }
}
