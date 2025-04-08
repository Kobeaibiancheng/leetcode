package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {

    List<Integer> list = new LinkedList<>();

    public MyHashSet() {

    }

    public void add(int key) {

        if(!list.contains(key)){
            list.add(key);
        }
    }

    public void remove(int key) {
        Integer integer = new Integer(key);
        list.remove(integer);

    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}
