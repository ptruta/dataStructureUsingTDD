package datastructures.tree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTreeTest {
    private MyTree<Integer> myTree;

    @BeforeEach
    public void setup() {
        myTree = new MyTree<>(3);
        myTree.insert(1);
        myTree.insert(2);
        myTree.insert(4);
        myTree.insert(5);
    }

    @Test
    public void itShouldInsertElementToTheTree() {
        assertEquals(1,myTree.minValue(myTree));
    }

    @Test
    public void itShouldContainTheNode() {
        assertTrue(myTree.contains(4));
        assertFalse(myTree.contains(10));
    }

    @Test
    public void itShouldGetTheValueOfTheNode() {
        assertEquals(3,myTree.getValue(myTree));
    }

    @Test
    public void itShouldDeleteTheValueFromTheTree() {
        assertEquals(myTree,myTree.deleteRecursive(myTree, 3));
    }

    @AfterEach
    public void cleanup() {
        myTree = null;
    }
}
