package list;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 */
public class RemoveDuplicateNodes {

    /**
     * 删除未排序的链表中重复的结点
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode ret = new ListNode(-1,head);
        ListNode pre = ret;
        ListNode p = ret.next;
        while(p != null){
            if(!set.contains(p.val)){
                set.add(p.val);
                p = p.next;
                pre = pre.next;
            }else{
                pre.next = p.next;
                p = pre.next;
            }
        }
        return ret.next;
    }
}
