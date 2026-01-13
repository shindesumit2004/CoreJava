package org.example.Collection.Arraylist;

import java.util.ArrayList;

public class TrimSize {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.ensureCapacity(20);

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        list.trimToSize();
        System.out.println(list);

    }
}
