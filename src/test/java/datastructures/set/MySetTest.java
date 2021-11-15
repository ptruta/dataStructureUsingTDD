package datastructures.set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {

    private static MySet<Integer> mySet;

    @BeforeEach
    public void setup() {
        mySet = new MySet<>();
        mySet.add(3);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
    }

    @Test
    public void itShouldSeeIfContainsAnElement() {
        assertTrue(mySet.contains(3));
        assertFalse(mySet.contains(4));
    }

    @Test
    public void itShouldSeeIfTheSetIsEmpty() {
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void itShouldAddElementInTheSet() {
        assertEquals(3, mySet.size());
    }

    @Test
    public void itShouldRemoveElementByValue() {
        mySet.remove(3);
        assertEquals(2, mySet.size());
    }

    @AfterEach
    public void cleanup() {
        mySet = null;
    }

}
