package org.example.Multithreading;

class MyThreads extends Thread{
    @Override
    public void run() {
        System.out.println("i am from a MyThread class");
    }
}
class MyThreads2 extends Thread{
    @Override
    public void run() {
        System.out.println("I am from MyThreads 2");
    }
}

public class MultipleTaskFromMT {
    public static void main(String[] args) {
        MyThreads2 t1 = new MyThreads2();
        t1.start();
        MyThreads2 t2 = new MyThreads2();
        t2.start();

    }
}
