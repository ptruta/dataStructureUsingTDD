package datastructures.stack;

public class MyStack<T> {
    // last In first Out
    private MyNode<T> topNode;
    private int size = 0;


    public void push(T item) {
        if (size == 0) {
            topNode = new MyNode<>(item, null);
        } else {
            var temp = new MyNode<>(item, topNode);
            topNode = temp;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return topNode.getValue();
    }

    public void pop() {
        topNode = topNode.getNext();
        size--;
    }
}
