public class SingleList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }


    /**
     * leetcode上题解
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == cur.val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
    /**
     * 自己写的
     * @param head
     * @return
     */
    /*public static ListNode deleteDuplicates(ListNode head) {
        if(head != null) {
            ListNode prev = head;
            ListNode cur = prev.next;
            while (cur != null) {
                if (prev.val == cur.val) {
                    cur = cur.next;
                    //处理链表最后是重复的节点:  直接将prev.next = null;
                    if(cur == null) {
                        prev.next = null;
                    }
                }else {
                    prev.next = cur;
                    prev = cur;
                    cur = cur.next;
                }
            }
        }
        return head;
    }*/
    //删除单链表中重复的节点
    /**
     * 自己写的垃圾代码
     */
    /*public static ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(-1);
        ListNode cur = head;
        ListNode prev = newHead;
        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while(cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
            }else {
                prev.next = cur;
                prev = cur;
                cur = cur.next;
            }
        }
        prev.next = null;
        return newHead.next;
    }*/
}
