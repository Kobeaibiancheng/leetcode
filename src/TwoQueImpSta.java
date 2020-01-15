import java.util.LinkedList;
import java.util.Queue;
public class TwoQueImpSta {
    private Queue<Integer> que1;
    private Queue<Integer> que2;
    /** Initialize your data structure here. */
    public TwoQueImpSta() {
        this.que1 = new LinkedList<>();
        this.que2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (!this.que1.isEmpty()) {
            this.que1.offer(x);
        }else if (!this.que2.isEmpty()) {
            this.que2.offer(x);
        }else {
            this.que1.offer(x);
        }
    }
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = 0;
        if (!this.que1.isEmpty()) {
            size = this.que1.size()-1;
            for (int i = 0; i < size; i++) {
                this.que2.offer(this.que1.poll());
            }
            return this.que1.poll();
        }
        if (!this.que2.isEmpty()) {
            size = this.que2.size()-1;
            for (int i = 0; i < size; i++) {
                this.que1.offer(this.que2.poll());
            }
            return this.que2.poll();
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        int size = 0;
        int tmp = 0;
        if (!this.que1.isEmpty()) {
            size = this.que1.size();
            for (int i = 0; i < size; i++) {
                tmp = this.que1.poll();
                this.que2.offer(tmp);
            }
            return tmp;
        }
        if (!this.que2.isEmpty()) {
            size = this.que2.size();
            for (int i = 0; i < size; i++) {
                tmp = this.que2.poll();
                this.que1.offer(tmp);
            }
            return tmp;
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (this.que1.isEmpty() && this.que2.isEmpty()) {
            return true;
        }
        return false;
    }
}
