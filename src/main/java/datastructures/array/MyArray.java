package datastructures.array;

import java.util.Scanner;

/**
 * Arrays
 *
 * Linear Data Structure
 * Elements are stored in contiguous memory locations
 * Can access elements randomly using index
 * Stores homogeneous elements i.e, similar elements
 * Syntax:
 * datastructures.arrayList.array.Array declaration
 * datatype varname []=new datatype[size];
 * datatype[] varname=new datatype[size];
 * Can also do declaration and initialization at once
 * Datatype varname [] = {ele1, ele2, ele3, ele4};
 * Advantages
 *
 * Random access
 * Easy sorting and iteration
 * Replacement of multiple variables
 * Disadvantages
 *
 * Size is fixed
 * Difficult to insert and delete
 * If capacity is more and occupancy less, most of the array gets wasted
 * Needs contiguous memory to get allocated
 * Applications
 *
 * For storing information in a linear fashion
 * Suitable for applications that require frequent searching
 */
public class MyArray {

    /**
     * Add element at a specific index in the array
     *
     * @param idx
     * @param el
     * @param arr
     * @return
     */
    public static long[] addAtIndex(int idx, long el, long[] arr) {
        int i;

        // create a new array of size n+1
        long[] newArr = new long[arr.length + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < arr.length + 1; i++) {
            if (i < idx - 1)
                newArr[i] = arr[i];
            else if (i == idx - 1)
                newArr[i] = el;
            else
                newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    public static long[] addElement(long el, long[] arr) {
        long[] newArr = new long[arr.length + 1];
        newArr[arr.length + 1] = el;
        return newArr;
    }

    public static long[] deleteElement(long el, long[] arr) {
//        long[] newArr = new long[arr.length + 1];
//        newArr[arr.length + 1] = el;
//        return newArr;
        return null;
    }

    public static void main (String[] args) {

        long[] priceOfPen= new long[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<priceOfPen.length;i++)
            priceOfPen[i]=in.nextInt();

        long[] arr = addAtIndex(2,44444444, priceOfPen);

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
