package list;

/**
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 *
 * 请你返回该链表所表示数字的 十进制值 。
 */
public class GetDecimalValue {


    /**
     * 先遍历了一遍链表，直到有几个节点，那么每一位上地权重就知道了，然后再遍历一遍，累加起来
     * @param head
     * @return
     */
    public int getDecimalValue(ListNode head) {
        ListNode p = head;
        int i = 0;
        int ret = 0;
        while(p != null) {
            i++;
            p = p.next;
        }
        i = i - 1;
        p = head;
        System.out.println(i);
        while(i >= 0){
            ret = ret + p.val*(int)Math.pow(2,i);
            i--;
            p = p.next;
        }
        return ret;
    }


    public int getDecimalValue1(ListNode head) {
        ListNode curNode = head;
        int ans = 0;
        while (curNode != null) {
            ans = ans * 2 + curNode.val;
            curNode = curNode.next;
        }
        return ans;
    }
}
