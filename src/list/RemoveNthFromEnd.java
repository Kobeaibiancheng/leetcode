package list;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveNthFromEnd {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(-1,head);
        ListNode cur = node;
        ListNode pre = node;
        int i = 0;
        while(cur != null && i < n){
            cur = cur.next;
            i++;
        }
        if(cur == null){
            return cur;
        }
        while(cur.next != null){
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return node.next;
        /**ListNode cur = head;
        ListNode pre = head;
        int count = 0;
        while(cur != null){
            cur = cur.next;
            count++;
        }
        if(n == count){
            return head.next;
        }
        int i = 0;
        cur = head;
        while(cur != null && i < n){
            cur = cur.next;
            i++;
        }
        if(cur == null){
            return cur;
        }
        while(cur.next != null){
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
        */
    }
}
