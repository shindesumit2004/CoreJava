package org.example.Collection.Arraylist;

import java.util.ArrayList;

public class WayToCreateArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        ArrayList<String> list2 = new ArrayList<String>(20);

        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
    }
}
