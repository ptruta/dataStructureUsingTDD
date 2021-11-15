package datastructures.graph;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyGraphTest {

    public MyGraph<Integer> myGraph;

    public int node1 = 1;
    public int node2 = 2;
    public int node3 = 3;
    public int node4 = 4;

    @BeforeEach
    public void setup() {
        myGraph = new MyGraph(5);

        myGraph.setValue(21, (int) node1);
        myGraph.setValue(23, (int) node2);
        myGraph.setValue(21, (int) node3);
        myGraph.setValue(23, (int) node4);

        myGraph.addEdge(node1,node2,1);
        myGraph.addEdge(node3,node4,22);
        myGraph.addEdge(node3,node2,23);
    }
    
    @Test
    public void itShouldAddEdges() {
        assertEquals(3, myGraph.edgeCount());
    }

    @Test
    public void itShouldSetValuesForTheNode() {
        assertEquals(5,myGraph.nodeCount());
    }

    @Test
    public void itShouldGetValueForTheNode() {
        assertEquals(23, myGraph.getValue(5));
    }

    @Test
    public void itShouldAddEdgeWithAWeight() {
        assertEquals(1, myGraph.weight(node1,node2));
    }

    @Test
    public void itShouldDeleteEdge() {
        myGraph.removeEdge(node1,node2);
        assertEquals(0, myGraph.weight(node1,node2));
    }

    @Test
    public void itShouldVerifyIfItHasEdge() {
        assertTrue(myGraph.hasEdge(node3,node4));
        assertFalse(myGraph.hasEdge(node2,node3));
        assertFalse(myGraph.hasEdge(node1,node3));
        assertTrue(myGraph.hasEdge(node3,node2));
    }

    @Test
    public void itShouldGetNeighbors() {
        assertArrayEquals(new int[]{2, 4},myGraph.getNeighbors(node3));
    }
    
    @AfterEach
    public void cleanup() {
        myGraph = null;
    }

}
