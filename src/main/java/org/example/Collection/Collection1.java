package org.example.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class Collection1 {

    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<>();

        // Add
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Graphs");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Strawberry");

        System.out.println("---------------------------------------------------------------");

        Collection<String> morefruits = new ArrayList<>();
        morefruits.add("PineApple");
        morefruits.add("Chiku");

        System.out.println(fruits.addAll(morefruits));

        System.out.println("-------------------------------------------------------------------");

        System.out.println(fruits.remove("Chiku"));

        System.out.println("----------------------------------------------------------------------");

        System.out.println(fruits.retainAll(fruits));

        System.out.println("------------------------------------------------------------------------");

        System.out.println(fruits.contains("Orange"));

        System.out.println("--------------------------------------------------------------------------");

        System.out.println( fruits.containsAll(morefruits));

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Using Iterator");

        Iterator iterator = fruits.iterator();

        for (String list : fruits){
            System.out.println(list);
        }

        System.out.println("-------------------------------------------------------------------------");

        Object[] arr = fruits.toArray();
        System.out.println("Using toArray : "+ Arrays.toString(arr));

        System.out.println("-------------------------------------------------------------------------------");




    }
}
