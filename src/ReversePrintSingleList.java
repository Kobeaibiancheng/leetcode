import java.util.Stack;

public class ReversePrintSingleList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        int[] ret = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            ret[i++] = stack.pop().val;
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
