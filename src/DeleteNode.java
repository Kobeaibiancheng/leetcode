class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
public class DeleteNode {
    /**
     * 在O(1)的时间删除链表节点
     * @param head
     * @param delete
     * @return
     */
    public boolean deleteNode(Node head,Node delete) {
        if (head == null || delete == null) {
            return false;
        }
        //删除的不是尾节点
        if (delete.next != null) {
            delete.val = delete.next.val;
            delete.next = delete.next.next;
        }
        //链表只有一个节点，删除头节点（也是尾节点）
        else if (head == delete) {
            head = null;
        }
        //链表中有多个节点，要删除的是尾节点
        else {
            Node cur = head;
            while (cur != null) {
                if (cur.next != delete) {
                    cur = cur.next;
                }
            }
            cur.next = null;
        }
        return true;
    }
}
