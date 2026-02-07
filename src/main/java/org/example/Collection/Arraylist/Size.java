package org.example.Collection.Arraylist;

import java.util.ArrayList;
import java.util.Objects;

public class Size {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<Double>();

        list.add(1.1);
        list.add(1.2);
        list.add(1.3);
        list.add(1.4);
        list.add(1.5);
        list.add(1.6);
        list.add(1.7);
        list.add(1.8);

        System.out.println(list);

        System.out.println("Size of ArrayList : "+list.size()); // 8

        System.out.println(list.isEmpty());  // False

        System.out.println(list.contains(1.1));  // True


        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("JAVA");
        list1.add("J2EE");
        list1.add("JSP");
        list1.add("JAVA");
        list1.add("SERVLETS");
        list1.add("JAVA");
        list1.add("STRUCTS");

        System.out.println(list1);
        System.out.println(list1.indexOf("JAVA"));  // 0
        System.out.println(list1.lastIndexOf("JAVA"));//5


        Object[] array = list1.toArray();

        for (Object object : array){
            System.out.println(object);
        }



    }
}
