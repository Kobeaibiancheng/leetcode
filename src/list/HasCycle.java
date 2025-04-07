package list;

/**
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 *为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 */
public class HasCycle {

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode cur = head;
        ListNode curNext = head;
        while(true){
            if(curNext.next == null || curNext.next.next == null){
                return false;
            }
            curNext = curNext.next.next;
            if(curNext == cur){
                return true;
            }
            cur = cur.next;
        }
    }
}
