package datastructures.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    private MyStack<Integer> myStack;

    @BeforeEach
    public void setup() {
        myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
    }

    @Test
    public void itShouldPushElementToTheStack() {
        assertEquals(4, myStack.size());
    }

    @Test
    public void itShouldGetTheTopNodeValue() {
        assertEquals(4,myStack.peek());
    }

    @Test
    public void itShouldRemoveTheTopNode() {
        myStack.pop();
        assertEquals(3,myStack.size());
    }


    @AfterEach
    public void cleanup() {
        myStack = null;
    }
}
