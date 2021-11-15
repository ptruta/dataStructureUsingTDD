package datastructures.doublyLinkedList;

public class MyDNode<T> {
        private MyDNode<T> prev;
        private T data;
        private MyDNode<T> next;

    public MyDNode(MyDNode<T> prev, T data, MyDNode<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public MyDNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyDNode<T> prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyDNode<T> getNext() {
        return next;
    }

    public void setNext(MyDNode<T> next) {
        this.next = next;
    }
}
