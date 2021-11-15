package datastructures.queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    private MyQueue<Integer> myQueue;

    @BeforeEach
    public void setup() {
        myQueue = new MyQueue<>();
        myQueue.queue(1);
        myQueue.queue(2);
        myQueue.queue(3);
        myQueue.queue(4);
    }

    @Test
    public void itShouldAddElementToTheQueue() {
        assertEquals(4,myQueue.size());
    }


    @Test
    public void itShouldPeekTheValueOfTheFirstElement(){
        assertEquals(1, myQueue.peek());
    }

    @Test
    public void itShouldRemoveFromTheQueue() {
        myQueue.dequeue();
        assertEquals(3, myQueue.size());
    }

    @AfterEach
    void cleanup() {
        myQueue = null;
    }

}
