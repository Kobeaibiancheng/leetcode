package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class IsPalindrome {
    /**
     * 先将链表遍历一遍，并且将val保存到一个ArrayList中，然后首尾指针同时向中间移动，直到两个指针相遇
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while(p != null){
            list.add(p.val);
            p = p.next;
        }
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            if(list.get(i) != list.get(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;

    }

    /**
     * 还可以通过反转链表的后半段，然后依次比较
     */
}
