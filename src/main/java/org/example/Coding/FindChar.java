package org.example.Coding;

import java.util.HashMap;
import java.util.Map;

//How to count occurrences of each character in a string in Java?

public class FindChar {
    public static void main(String[] args) {

        String str = "Java J2EE Java JSP J2EE";

        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = str.toCharArray();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
