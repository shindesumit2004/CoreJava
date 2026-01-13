package org.example.Multithreading.Anonymous;

abstract class Person1{
     abstract void show();
     abstract void name();
}
class Person2{
    void show(){
        System.out.println("I am from the Abstract field.");
    }

}

public class AbstarctClass1 {
    public static void main(String[] args) {

        Person1 p = new Person1() {
            @Override
            void show() {
                System.out.println("I am from the abstract class.");
                System.out.println("I am from the abstract.");
            }

            @Override
            void name() {
                System.out.println("I am from the abstract class");
            }
        };

        p.show();
        p.name();
    }
}
