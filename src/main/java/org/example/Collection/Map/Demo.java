package org.example.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Demo {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(101,"Deepak");
        map.put(102,"amit");
        map.put(103,"kamal");

     //   map.clear();
        System.out.println(map);

        System.out.println(map.containsKey(105));
        System.out.println(map.containsKey("ankit"));
        System.out.println(map.get(102));

        map.remove(102);
        map.replace(102,"ravi");
        System.out.println(map.size());

        System.out.println(map);
        System.out.println(map.isEmpty());
        //System.out.println(map.containsKey(101,"Deepak"));
        map.get(102);
        map.put(102,"sumit");


        //map.put(102,"ravi");
      //  map.keySet(102);
        map.equals(102);
      //  int i = map.hashCode(102,"amit");


    }

}
