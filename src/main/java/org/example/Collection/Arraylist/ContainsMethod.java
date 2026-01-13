package org.example.Collection.Arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList<Double> al = new ArrayList<Double>();

        al.add(1.1);
        al.add(11.11);
        al.add(111.111);
        al.add(1111.1111);

        System.out.println(al.contains(111.111));
    }
}
