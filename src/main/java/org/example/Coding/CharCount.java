package org.example.Coding;

import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {

        String str = "Java J2EE Java JSP J2EE";

       HashMap<Character, Integer> map = new HashMap<>();

       for (int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);

           map.put(ch, map.getOrDefault(ch, 0)+1);
       }
        System.out.println(map);

    }
}
