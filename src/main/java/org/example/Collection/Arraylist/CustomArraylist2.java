package org.example.Collection.Arraylist;

import java.util.Arrays;

public class CustomArraylist2<e>{

    //Private hide the variable from external use of classes

    private int size = 0;
    private Object[] arr;
    private static final int initialCapacity = 10;

    // constructor
    // When we create a object of this class then this constructor grt automatically call
    // eg: CustomArrayList<Integer> list = new CustomArrayList<>();

    public CustomArraylist2(){
        arr = new Object[initialCapacity];
    }

    //Add Method
    public void add(Object e){
        if (size == arr.length){
            ensureCapacity();
        }
        arr[size++] = e;
    }

    // EnsureCapacity Method
    public void ensureCapacity(){
        int newCapacity = arr.length * 2;
        arr = Arrays.copyOf(arr, newCapacity); // creates a double array and copies existing elements.
    }

    // Get element at particular index

}
