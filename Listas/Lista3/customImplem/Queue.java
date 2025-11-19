package customImplem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
    private List<T> list;

    public Queue() {
        this.list = new LinkedList<>();
//        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void enqueue(T item) {
        this.list.add(item);
    }

    public T dequeue() {
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.removeFirst();
    }

    public T peek() {
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.get(0);
    }

    public int size() {
        return this.list.size();
    }

    public void clear() {
        this.list =  new ArrayList<>();
    }

}
