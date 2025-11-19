package customImplem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    private List<T> list;

    public Stack() {
        this.list = new LinkedList<>();
//        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void push(T item) {
        this.list.add(item);
    }

    public T pop() {
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.removeLast();
    }

    public T peek() {
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.get(this.list.size() - 1);
    }

    public int size() {
        return this.list.size();
    }

    public void clear() {
        this.list =  new ArrayList<>();
    }

}