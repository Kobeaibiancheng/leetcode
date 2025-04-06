package list;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */
public class DeleteDuplicates {

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

    /*public ListNode deleteDuplicates(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1 != null && p2 != null){
            while(p1 != null && p1.val == p2.val){
                p1 = p1.next;
            }
            if(p1 == null){
                p2.next = p1;
                return head;
            }else{
                p2.next = p1;
                p1 = p1.next;
                p2 = p2.next;
            }

        }
        return head;
    }*/

    /**
     * 删除重复元素------Set里面存放的就是不重复的元素，所以想到遍历一边链表，然后add到set中，
     * 最后在根据set里的元素创建链表，然后就是不重复元素的链表，但是前提是有序的链表，所有要用TreeSet这个实现类（有序的set），
     * 而HashSet这个类是无序的set
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head){
        Set<Integer> set = new TreeSet<>();
        //Set<Integer> set = new HashSet<>();
        ListNode cur = head;
        while(cur != null) {
            set.add(cur.val);
            cur = cur.next;
        }

        Iterator<Integer> it = set.iterator();
        ListNode ret = new ListNode();
        cur = ret;
        while (it.hasNext()){
            ListNode node = new ListNode();
            node.val = it.next();
            cur.next = node;
            cur = cur.next;
        }
        return ret.next;

    }
}
