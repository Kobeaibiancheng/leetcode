

public class CircularQueue<T> {
    public T[] elem;
    int front;//队首下标
    int rear;//队尾的下一个索引(即将入队的下标)
    int usedSize = 0;//队列元素大小

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public CircularQueue(int k) {
        this.elem = (T[]) new Object[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(T value) {
        if (isFull()) {
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1) % this.elem.length;
        this.usedSize++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        this.front = (this.front+1) % this.elem.length;
        this.usedSize--;
        return true;
    }

    /** Get the front item from the queue. */
    public T Front() {
        if(isEmpty()) {
            return null;
        }
        return this.elem[this.front];
    }

    /** Get the last item from the queue. */
    public T Rear() {
        if(isEmpty()) {
            return null;
        }
        return this.rear == 0 ? this.elem[this.elem.length-1] : this.elem[this.rear-1];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public static void main(String[] args) {

        System.out.println(-1%7);
        CircularQueue<Character> circularQueue = new CircularQueue<>(10);
        circularQueue.enQueue('1');
        circularQueue.enQueue('2');
        circularQueue.enQueue('3');
        circularQueue.enQueue('4');
        System.out.println(circularQueue.Rear());
        circularQueue.deQueue();
        circularQueue.enQueue('4');

    }
}
