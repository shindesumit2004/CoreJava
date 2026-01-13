package org.example.Collection.Arraylist;

import java.util.ArrayList;

public class InsertedAndDeleted {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Zero");
        list.add("Two");
        list.add("Four");

        System.out.println(list);

        list.add(2, "Three");
        list.add(1, "One");

        System.out.println(list);

        list.remove(3);
        System.out.println(list);

    }
}
