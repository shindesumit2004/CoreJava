package org.example.Multithreading.Anonymous;

interface A{
    void show1();
    void show3();
    void show4();
    void show5();
}
interface B{
    void show2();
}

public class AnonynmousEx2 {
    public static void main(String[] args) {

        A a = new A(){
            public void show1(){
                System.out.println("I am from the A interfaces.");
            }
            public void show3(){
                System.out.println("I am from the A interface.");
            }

            @Override
            public void show4() {
                System.out.println("I am from the A interfaces.");
            }

            @Override
            public void show5() {
                System.out.println("I am from the A interfaces.");
            }
        };

        B b = new B() {
            @Override
            public void show2() {
                System.out.println("I am from the B interfaces.");
            }
        };
        a.show1();
        a.show3();
        a.show4();
        a.show5();
        b.show2();

    }

}
