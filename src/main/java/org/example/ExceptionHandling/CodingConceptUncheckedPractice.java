package org.example.ExceptionHandling;

public class CodingConceptUncheckedPractice {

    public static void main(String[] args) {


        // ClassCast Exception
/*
        Object val = 0;
        System.out.println((String)val);


        // Arithmetic Exception

        int a = 10;
        int b = 0;
        int c = a/b;

        System.out.println(c);


        // IndexOutOfBound Exception

        1) ArrayIndexOutOfBounds Exception
        int[] val = new int[2];
        System.out.println(val[4]);


        2) StringIndexOutOfBounds Exception
        String val = "Hello";
        System.out.println(val.charAt(5));


        // NullPointerException
        String val = null;
        System.out.println(val.charAt(3));

 */

        // IllegalArgumentException

        int val = Integer.parseInt("abc");
        System.out.println(val);
    }
}
