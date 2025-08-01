package lru;

import java.util.HashMap;
import java.util.Map;




public class LRUCache {
    static class Node{
        public int key;
        public int value;
        public Node next;
        public Node prev;
        public Node() {

        }
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    private final Map<Integer,Node> map = new HashMap<>();
    private int capacity;
    private Node head = new Node();

    //初始化，循环双向链表
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = head;
        head.prev = head;
    }

    public int get(int key) {
        //首先判断map中是否有这个key
        if(map.containsKey(key)){
            Node node = map.get(key);

            //从原来的位置删除
            node.prev.next = node.next;
            node.next.prev = node.prev;

            //将对应的node放入头节点后面
            node.prev = head;
            node.next = head.next;
            node.next.prev = node;
            head.next = node;

            return node.value;
        }
        return -1;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            //有这个key
            Node node = map.get(key);

            //从原位置删除
            node.prev.next = node.next;
            node.next.prev = node.prev;

            //放入头节点后面
            node.prev = head;
            node.next = head.next;
            node.next.prev = node;
            head.next = node;

            //跟新值
            node.value = value;

        }else {
            //没有这个key，那么就是头节点插入
            //先判断满没满
            if (map.size() == capacity){
                //满了，从map中删除这个key，先删除链表结尾节点，再头节点插入，再map中添加一个
                Node removeKey = head.prev;
                map.remove(removeKey.key);
                //删除尾节点
                head.prev.prev.next = head;
                head.prev = head.prev.prev;

                //头节点新插入一个
                Node newNode = new Node(key,value);
                //map中添加
                map.put(key,newNode);
                //链表中添加
                //放入头节点后面
                newNode.prev = head;
                newNode.next = head.next;
                newNode.next.prev = newNode;
                head.next = newNode;

            }else {
                //没满
                Node newNode = new Node(key,value);
                //map中添加
                map.put(key,newNode);
                //链表中添加
                //放入头节点后面
                newNode.prev = head;
                newNode.next = head.next;
                newNode.next.prev = newNode;
                head.next = newNode;

            }
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        cache.get(2);
        cache.put(4, 4);
        cache.get(1);
        cache.get(3);
        cache.get(4);
    }

}
