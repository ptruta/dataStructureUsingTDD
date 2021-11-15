package datastructures.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyArrayTest {

    @Test
    public void testAddAtIndex() {
        int idx = 2;
        long el = 222;
        long[] arr = new long[5];

        long arrEl1 = 1;
        long arrEl2 = 2;
        long arrEl3 = 3;
        long arrEl4 = 4;
        long arrEl5 = 5;

        arr[0] = arrEl1;
        arr[1] = arrEl2;
        arr[2] = arrEl3;
        arr[3] = arrEl4;
        arr[4] = arrEl5;

        long[] elements = new long[6];
        // Test case 1 at a idx in the array
        try {
            elements = MyArray.addAtIndex(idx,el,arr);
        } catch (Exception e) {
            assertFalse(false);
            System.out.println("Error: "+e);
        }
        assertEquals(elements[1], el);
        assertArrayEquals(elements, new long[]{1,222,2,3,4,5});

        idx = 6;
        // Test case 2 add at the end of the array
        try {
            elements = MyArray.addAtIndex(idx,el,arr);
        } catch (Exception e) {
            assertFalse( false);
            System.out.println("Error: "+e);
        }
        assertEquals(elements[5], el);
        assertArrayEquals(elements, new long[]{1,2,3,4,5,222});


        idx = 1;
        // Test case 3 add at the beginning of the array
        try {
            elements = MyArray.addAtIndex(idx,el,arr);
        } catch (Exception e) {
            assertFalse(false);
            System.out.println("Error: "+e);
        }
        assertEquals(elements[0], el);
        assertArrayEquals(elements, new long[]{222,1,2,3,4,5});
    }

    @Test
    public void testAddElement() {

    }
}