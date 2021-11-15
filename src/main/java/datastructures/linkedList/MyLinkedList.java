package datastructures.linkedList;

public class MyLinkedList<T> {
    private MyNode<T> lastNode;
    private MyNode<T> firstNode;
    private int size = 0;

    public int size() {
        return size;
    }

    public void add(T item) {
        if (size == 0) {
            lastNode = new MyNode<>(item, null);
            firstNode = lastNode;
        } else {
            var temp = lastNode;
            lastNode = new MyNode<>(item, null);
            temp.setNext(lastNode);
        }
        size++;
    }

    public void remove(T element) {
        var temp = firstNode;
        while (temp.getNext() != null) {
            if (temp.getNext().getValue().equals(element)) {
                temp.setNext(temp.getNext().getNext());
            }

            temp = temp.getNext();
        }
        size--;
    }

    public void removeByIndex(int index) {
        var temp = firstNode;
        for (var i = 0; i < index - 1; i++)
            temp = temp.getNext();

        temp.setNext(temp.getNext().getNext());
        size--;
    }

    public T getByIndex(int index) {
        var temp = firstNode;
        for (var i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    public T firstNode() {
        return firstNode.getValue();
    }
}
