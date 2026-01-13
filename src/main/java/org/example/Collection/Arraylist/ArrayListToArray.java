package org.example.Collection.Arraylist;

import java.util.ArrayList;
import java.util.Objects;
public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("JAVA");
        list.add("J2EE");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("STRUTS");

        System.out.println(list);

       /* Object[] array = list.toArray();

        for (Object object : array){
            System.out.println(object);
        }

        Object[] array = list.toArray();

        for (Object object : array){
            System.out.println(object);
        }
        Object[] array = list.toArray();

        for (Object object : array){
            System.out.println(object);
        }

        Object[] array = list.toArray();
        for (Object object : array){
            System.out.println(object);
        }
*/

//        for (Object object : array){
//            System.out.println(object);
//        }

//        Object[] array = list.toArray();
//        for (Object object : array) {
//            System.out.println(object);

        Objects[] array = (Objects[]) list.toArray();
        for (Objects objects : array){
            System.out.println(objects);
        }

    }
}
