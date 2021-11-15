package datastructures.linkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    public MyLinkedList<Integer> myLinkedList;

    @BeforeEach
    public void setup() {
        myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
    }

    @Test
    public void itShouldAddElementToTheLinkedList() {
        assertEquals(5,myLinkedList.size());
    }

    @Test
    public void itShouldRemoveElementFromTheLinkedList(){
        myLinkedList.remove(4);
        assertEquals(4, myLinkedList.size());
    }

    @Test
    public void itShouldRemoveByIndex() {
        myLinkedList.removeByIndex(4);
        assertEquals(4, myLinkedList.size());
    }

    @Test
    public void itShouldGetByIndex() {
        myLinkedList.removeByIndex(4);
        assertEquals(3, myLinkedList.getByIndex(3));
        assertEquals(1, myLinkedList.getByIndex(1));
        assertEquals(2, myLinkedList.getByIndex(2));
    }

    @Test
    public void itShouldGetTheFirstNodeValue() {
        assertEquals(1,myLinkedList.firstNode());
    }

    @AfterEach
    public void cleanup() {
        myLinkedList = null;
    }
}
