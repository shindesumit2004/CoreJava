package org.example.Multithreading.Anonymous;

interface Polygon1{
    public void display();
}

class AnonymousDemo1{
    public void createClass(){

        Polygon1 p1 = new Polygon1() {
            @Override
            public void display() {
                System.out.println("Inside Anonymous class");
            }
        };
        p1.display();
    }
}

public class AnonymousImplementingInterface {
    public static void main(String[] args) {

        AnonymousDemo d = new AnonymousDemo();
        d.createClass();
    }
}
