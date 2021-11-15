package datastructures.doublyLinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyDLinkedListTest {

        private MyDLinkedList<Integer> myDoublyLinkedList;
        @BeforeEach
        public void setup() {
            myDoublyLinkedList = new MyDLinkedList<>();
            myDoublyLinkedList.addToLast(100);
            myDoublyLinkedList.addToFront(99);
        }

        @Test
        void itShouldAppendTheItemAtTheEndOfTheList() {
            myDoublyLinkedList.addToLast(100);
            assertEquals(3, myDoublyLinkedList.size());
        }

        @Test
        public void itShouldAppendAtTheFrontOfTheList() {
            // When
            MyDNode<Integer> front = myDoublyLinkedList.front();

            // Then
            assertEquals(2, myDoublyLinkedList.size());
            assertEquals(99, front.getData());
            assertEquals(100, front.getNext().getData());
        }

        @Test
        public void itShouldReturnTheNodePrevToTheGivenNode() {
            assertEquals(99, myDoublyLinkedList.prev(100, 0));
        }

        @Test
        public void itShouldRemoveTheNodeFromTheList() {
            myDoublyLinkedList.remove(99);
            assertEquals(100, myDoublyLinkedList.front().getData());
        }

        @AfterEach
        public void cleanup() {
            myDoublyLinkedList = null;
        }
}
