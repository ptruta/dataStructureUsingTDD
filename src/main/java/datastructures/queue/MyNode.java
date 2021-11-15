package datastructures.queue;

public class MyNode<T> {
    private T value;
    private MyNode<T> next;

    public MyNode(T valueNode, MyNode<T> nextNode){
        this.next = nextNode;
        this.value = valueNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }


}
