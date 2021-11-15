package datastructures.tree;

public class MyNode<T> {
    T data;
    private MyNode<T> right;
    private MyNode<T> left;

    public MyNode(T data) {
        this.data = data;
    }

    public void insert(T value) {
        if ((Integer) value < (Integer) data) {
            if (left == null) {
                left = new MyNode<>(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new MyNode<>(value);
            } else {
                right.insert(value);
            }
        }
    }

    public T minValue(MyNode<T> root) {
        T minV = root.data;
        while (root.left != null) {
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }

    public boolean contains(T value) {
        if (data == value) {
            return true;
        } else if ((Integer) value < (Integer) data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public T getValue(MyNode<T> myNode) {
        return myNode.data;
    }

    public MyNode<T> deleteRecursive(MyNode<T> root, T value) {
       if (!contains(value)) {
           return null;
       }

        if (root == null) {
            return null;
        }

        if ((Integer)value < (Integer) root.data) {
            root.left = deleteRecursive(root.left, value);
        } else if ((Integer)value > (Integer) root.data) {
            root.right = deleteRecursive(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null){
                return root.left;
            }
            root.data = minValue(root.right);

            root.right = deleteRecursive(root.right, root.data);
        }

        return root;

    }

    public void printInOrder() {

        if(left!=null)
            left.printInOrder();

        System.out.println(this.data);

        if(right!=null)
            right.printInOrder();


    }

    public void printPreOrder() {

        System.out.println(this.data);

        if(left!=null)
            left.printInOrder();

        if(right!=null)
            right.printInOrder();


    }

    public void printPostOrder() {

        if(left!=null)
            left.printInOrder();

        if(right!=null)
            right.printInOrder();

        System.out.println(this.data);

    }

}
