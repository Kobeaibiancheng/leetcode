import java.util.Stack;

public class TwoStaImpQue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public TwoStaImpQue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        this.stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (this.stack2.empty()) {
            while (!this.stack1.empty()) {
                this.stack2.push(this.stack1.pop());
            }
        }
        if (!this.stack2.empty()) {
            return this.stack2.pop();
        }
        return -1;

    }

    /** Get the front element. */
    public int peek() {
        if (this.stack2.empty()) {
            while (!this.stack1.empty()) {
                this.stack2.push(this.stack1.pop());
            }
        }
        if (!this.stack2.empty()) {
            return this.stack2.peek();
        }
        return -1;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.stack1.empty() && this.stack2.empty();
    }
}
