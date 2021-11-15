package datastructures.set;

public class MySet<T> {

    private static int DEFAULT_SIZE = 2;
    private int size = 0;

    private Object[] set;

    public MySet() {
        set = new Object[DEFAULT_SIZE];
    }

    public void add(T element) {
        var i = 0;
        if (size + 1 > set.length) {
            var newArr = new Object[set.length * 2];
            for (var j = 0; j < size; j++) {
                newArr[j] = set[j];
            }
            set = newArr;
        }

        if (!contains(element) && !isEmpty()) {
            set[size++] = element;
        }

    }

    public int size() {
        return size;
    }

    public boolean contains(T element) {
        boolean itContains = false;
        var i = 0;
        while (i < size && !itContains) {

            if (set[i] == element) {
                itContains = true;
            }
            i++;
        }

        return itContains;
    }

    public boolean isEmpty() {
       return set.length == 0;
    }

    public void remove(T element) {
        if (contains(element)) {
            int i = 0;
            while (i < size && element != set[i]) {
                i++;
            }
            for (var j=i+1;j<size;j++) {
                set[j - 1] = set[j];
            }
            size--;
        }
    }
}
