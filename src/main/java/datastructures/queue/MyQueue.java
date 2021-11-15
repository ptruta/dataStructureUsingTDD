package datastructures.queue;

public class MyQueue<T> {
    // first In First Out
    private int size;
    private MyNode<T> first;
    private MyNode<T> curr;


    public void queue(T item) {
        var temp = first;
        if (size == 0) {
            first = new MyNode<>(item, null);
            curr = first;
        } else {
            var newNode = new MyNode<T>(item, curr);
            curr.setNext(newNode);
            curr = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }


    public T peek() {
        return first.getValue();
    }

    public void dequeue() {
        first = first.getNext();
        size--;
    }
}
