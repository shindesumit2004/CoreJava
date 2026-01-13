package org.example.Collection.Arraylist;

import java.util.ArrayList;

public class SizeMethod {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<Double>();

        list.ensureCapacity(20);

        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        list.add(4.4);
        list.add(5.5);
        list.add(6.6);
        list.add(7.7);
        list.add(8.8);
        list.add(9.9);
        System.out.println(list);
        System.out.println("Size of Arraylist" + list.size());
        System.out.println(list.remove(1.1));
        System.out.println(list.isEmpty());
        list.clear();

    }
}
