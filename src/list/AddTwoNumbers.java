package list;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {


    /**
     * 两数相加（每一位逆序存储）
     * 思路有有点像合合并两个有序单链表
     * 1.每一位相加，然后用一个变量nextVal来存储进位的信息
     * 2.链表对应位置相加时，需加上nextVal
     * 3.当链表不一样长时：用逻辑0来处理
     * 4.当最后两位相加仍大于10时，需要new一个节点，该节点的值为1
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        int nextVal = 0;
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;//逻辑补0
            int y = l2 == null ? 0 : l2.val;//逻辑补0

            int sum = x + y + nextVal;
            int everyNum = sum % 10;
            nextVal = sum/10;

            ListNode node = new ListNode(everyNum);
            cur.next = node;
            cur = node;

            //l1 = l1 == null ? null : l1.next;
            //l2 = l2 == null ? null : l2.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }
        if (nextVal != 0) {
            ListNode node = new ListNode(1);
            cur.next = node;
            cur = node;
        }

        return head.next;
    }



    /**
     * 这是我自己写的
     * 但是提交的时候显示超出内存限制
     * @param l1
     * @param l2
     * @return
     */
    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        int nextVal = 0;
        while(l1 != null && l2 != null){

            int sum = l1.val + l2.val + nextVal;
            int everyNum = sum % 10;
            nextVal = sum/10;

            ListNode node = new ListNode(everyNum);
            cur.next = node;
            cur = node;

            l1 = l1.next;
            l2 = l2.next;

        }
        while(l1 != null){
            int sum = l1.val + nextVal;
            int everyNum = sum % 10;
            nextVal = sum/10;

            ListNode node = new ListNode(everyNum);
            cur.next = node;
            cur = node;

            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.val + nextVal;
            int everyNum = sum % 10;
            nextVal = sum/10;

            ListNode node = new ListNode(everyNum);
            cur.next = node;
            cur = node;

            l1 = l2.next;
        }

        if(nextVal != 0){
            ListNode node = new ListNode(nextVal);
            cur.next = node;
            cur = node;
        }


        return head.next;



    }*/
}
