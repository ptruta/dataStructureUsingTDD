package datastructures.graph;

public class MyGraph<T> {

    private int[][] matrix;
    private T[] nodeValues;
    private int numEdge;

    public MyGraph(int n) {
        matrix = new int[n][n];
        nodeValues = (T[])new Object[n];
        numEdge = 0;
    }

    public void addEdge(T node1, T node2, T weight) {
        if ((Integer)weight == 0) {
            return;
        }

        if (matrix[(Integer) node1][(Integer) node2] == 0) {
            numEdge++;
        }

        matrix[(Integer) node1][(Integer) node2] = (Integer)weight;
    }

    public int edgeCount() {
        return numEdge;
    }

    public int weight(T node1, T node2) {
        return matrix[(Integer) node1][(Integer) node2];
    }

    public int nodeCount() {
        return nodeValues.length;
    }

    public void removeEdge(T node1, T node2) {
        if (matrix[(Integer) node1][(Integer)node2] != 0) {
            matrix[(Integer) node1][(Integer)node2] = 0;
            numEdge--;
        }
    }


    public void setValue(T value, int node1) {
        nodeValues[node1] = value;
    }

    public T getValue(int i) {
        return nodeValues[i-1];
    }

    public boolean hasEdge(T node3, T node4) {
        return matrix[(Integer) node3][(Integer)node4] != 0;
    }

    public int[] getNeighbors(T node3) {
        int count = 0;
        int[] temp;
        int i = 0;

        for (i = 0; i < nodeValues.length; i++) {
            if (matrix[(Integer)node3][i] != 0 ) {
                count++;
            }
        }

        temp = new int[count];

        for (i = 0, count = 0; i < nodeValues.length; i++) {
            if (matrix[(Integer)node3][i] != 0 ) {
                temp[count++] = i;
            }
        }

        return temp;
    }
}
