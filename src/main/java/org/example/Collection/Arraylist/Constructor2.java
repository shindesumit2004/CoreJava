package org.example.Collection.Arraylist;

import java.util.ArrayList;

public class Constructor2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        // Now it can hold 10 elements (Default initial capacity)

        list.ensureCapacity(20);
        //Now it can hold 20 element
    }
}
