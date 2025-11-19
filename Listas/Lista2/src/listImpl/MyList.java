package listImpl;

public class MyList<T> {
    private Node<T> head;
    private int size;

    public MyList() {
        head = null;
        size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void addAtStart(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        Node<T> aux = head;
        head = newNode;
        newNode.setNext(aux);
        size++;

    }

    public void addAtEnd(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        Node<T> aux = head;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(newNode);
        size++;
    }

    public void addAtPosition(T value, int position) {
        if (position == 0) {//AtStart
            addAtStart(value);
            return;
        }

        if (position == size) {//AtEnd
            addAtEnd(value);
            return;
        }
        //any position, not start or end
        Node<T> newNode = new Node<>(value) ;
        Node<T> aux = getNode(position - 1);
        newNode.setNext(aux.getNext());
        aux.setNext(newNode);
        size++;
    }

    public int indexOf(T value) {
        Node<T> aux = head;
        int index = 0;
        while (aux != null) {
            if (aux.getValue() == value)
                return index;
            aux = aux.getNext();
            index++;
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    public Node<T> getNode(int index) {
        if(index < 0 || index >= size) {
            return null;
        }
        Node<T> aux = head;
        int i = 0;
        while (i != index) {
            aux = aux.getNext();
            i++;
        }
        return aux;
    }

    public T removeAtPosition(int position) {
        if (position < 0 || position >= size) {
            return null;
        }
        T item = null;

        //AtStart
        if (position == 0) {
            item = head.getValue();
            head = head.getNext();
            size--;
            return item;
        }
        //AtEnd
        Node<T> aux = null;
        if (position == size - 1) {
            item = getNode(position).getValue();
            aux = getNode(position - 1);
            aux.setNext(null);
            size--;
            return item;
        }
        //any position, not start or end
        aux = getNode(position - 1);
        item = aux.getValue();
        aux.setNext(aux.getNext().getNext());
        size--;

        return item;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        String result = "[";
        Node<T> aux = head;
        while (aux.getNext() != null) {
            result += aux.getValue() + ", ";
            aux = aux.getNext();
        }
        result += aux.getValue() + "]";
        return result;
    }
}
