package org.example.Multithreading.Anonymous;

interface Person{
    void show();
    void class2();
}

public class AnonymousExample {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            public void show() {
                System.out.println("I am from the Anonymous class");

            }

            @Override
            public void class2() {
                System.out.println("I am from Anonymous class but outside the  ");
            }
        };
        p.show();
        p.class2();
    }
}
