package list;


/**
 * 给定单链表的头节点 head ，请反转链表，并返回反转后的链表的头节点。
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return pre;
    }



    /**
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode curNext = cur.next;
        while(cur != null){
            cur.next = pre;
            pre = cur;
            cur = curNext;
            if(curNext == null){
                break;
            }
            curNext = curNext.next;
        }
        return pre;
    }
     **/
}
