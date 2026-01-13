package org.example.Collection.Arraylist;

import java.util.ArrayList;
import java.util.Objects;

public class DuplicatesInArrayListUsingHashset {
    public static void main(String[] args) {

        ArrayList<String> duplicate = new ArrayList<String>();

        duplicate.add("A");
        duplicate.add("B");
        duplicate.add("C");
        duplicate.add("D");
        duplicate.add("E");
        duplicate.add("F");
        duplicate.add("G");
        duplicate.add("H");
        duplicate.add("J");
        duplicate.add("K");
        duplicate.add("L");
        duplicate.add("M");

        System.out.println(duplicate);

        Object[] array = duplicate.toArray();
        for (Object object : array){
            System.out.println(object);
        }


    }
}
