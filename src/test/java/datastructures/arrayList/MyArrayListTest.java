package datastructures.arrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    private MyArrayList<Integer> myArrayList;

    @BeforeEach
    public void setup() {
        myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(23);
        myArrayList.add(40);
        myArrayList.add(40);
    }

    @Test
    void itShouldAddNewItemToTheArrayList() {
        assertEquals(5, myArrayList.size());
    }

    @Test
    void itShouldGetElementByIndex(){
        assertEquals(23, myArrayList.get(3));
    }

    @Test
    void itShouldDeleteElementByIndex() {
        myArrayList.removeByIndex(2);
        assertEquals(4, myArrayList.size());
        assertEquals(1, myArrayList.get(1));
        assertEquals(2, myArrayList.get(2));
        assertEquals(40, myArrayList.get(3));
        assertEquals(40, myArrayList.get(4));

    }

    @Test
    void itShouldDeleteElementByValue() {
        myArrayList.removeByValue(2);
        assertEquals(4, myArrayList.size());
        assertEquals(1, myArrayList.get(1));
        assertEquals(23, myArrayList.get(2));
        assertEquals(40, myArrayList.get(3));
        assertEquals(40, myArrayList.get(4));
    }

    @AfterEach
    public void cleanup() {
        myArrayList = null;
    }

}
