package org.example.Practice2;

public class Swap2Number {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Value of A is : "+a);
        System.out.println("Value of B is : "+b);
    }
}
