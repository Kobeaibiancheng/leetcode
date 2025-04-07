package list;


/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode();//不含信息的头节点
        node.next = head;
        ListNode pre = node;
        ListNode cur = pre.next;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return node.next;
    }
}
