package org.example.Collection.Arraylist;

import java.util.ArrayList;

public class Resizeable {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println(list.size());

        list.add("Four");
        list.add("Five");
        System.out.println(list.size());

        list.remove("Two");

        System.out.println(list.size());

    }
}
