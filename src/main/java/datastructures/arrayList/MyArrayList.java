package datastructures.arrayList;

public class MyArrayList<T> {

    private static final int DEFAULT_SIZE = 2;

    private int size = 0;

    private Object[] arr;

    public MyArrayList() {
        arr = new Object[DEFAULT_SIZE];
    }

    /**
     * Add element at the end of the array list
     *
     * @param item
     */
    public void add(T item) {
        if (size + 1 > arr.length) {
            var newArr = new Object[arr.length*2];
            for (var i=0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = item;
    }

    /**
     * Get an element at a specific index
     *
     * @param index
     * @return
     */
    public T get(int index) {
        return (T) arr[index - 1];
    }

    /**
     * Return the size of the array list
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * Remove element by index from the array list
     *
     * @param index
     */
    public void removeByIndex(int index) {
        for (var i=index+1;i<size;i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }


    /**
     * Remove element by value from the array list
     *
     * @param element
     */
    public void removeByValue(T element) {
        int i = 0;
        while (i < size && element != arr[i]) {
            i++;
        }
        removeByIndex(i);
    }
}
